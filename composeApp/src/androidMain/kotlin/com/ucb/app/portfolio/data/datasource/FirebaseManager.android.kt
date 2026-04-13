package com.ucb.app.portfolio.data.datasource

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.getValue
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await

actual class FirebaseManager actual constructor(){
    private val database = FirebaseDatabase.getInstance().reference

    actual suspend fun saveData(path: String, value: String) {
        try {
            database.child(path).setValue(value).await()
            println("Firebase Android: Guardado exitoso en $path")
        } catch (e: Exception) {
            println("Firebase Android: Error - ${e.message}")
        }
    }

    actual suspend fun getCurrency(): Flow<String>  = callbackFlow {
        val callback = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue(String::class.java)
                if (value != null) {
                    trySend(value)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                close(error.toException())
            }

        }
        val myRef = database.database.getReference("/currency")
        myRef.addValueEventListener(callback)

        awaitClose {
            myRef.removeEventListener(callback)
        }
    }
}