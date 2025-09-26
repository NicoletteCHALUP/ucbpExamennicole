package com.calyrsoft.ucbp1.features.dollar.data.datasource

import com.calyrsoft.ucbp1.features.dollar.domain.model.DollarModel
import com.google.firebase.database.*
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

class RealTimeRemoteDataSource(
    private val database: FirebaseDatabase
) {
    fun getDollarUpdates(): Flow<DollarModel> = callbackFlow {
        val ref: DatabaseReference = database.getReference("dollar")

        val listener = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val dollarOfficial = snapshot.child("dollarOfficial").value?.toString()
                val dollarParallel = snapshot.child("dollarParallel").value?.toString()
                val dollarUsdt = snapshot.child("usdt").value?.toString()
                val dollarUsdc = snapshot.child("usdc").value?.toString()

                val model = DollarModel(
                    dollarOfficial = dollarOfficial,
                    dollarParallel = dollarParallel,
                    dollarUsdt = dollarUsdt,
                    dollarUsdc = dollarUsdc,
                    timestamp = System.currentTimeMillis()
                )

                trySend(model)
            }

            override fun onCancelled(error: DatabaseError) {
                close(error.toException())
            }
        }

        ref.addValueEventListener(listener)

        awaitClose { ref.removeEventListener(listener) }
    }
}
