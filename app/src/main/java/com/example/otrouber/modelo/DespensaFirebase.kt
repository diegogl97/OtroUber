package com.example.otrouber.modelo

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.renglon_item.view.*

class DespensaFirebase {

    private lateinit var database: DatabaseReference

    constructor(){
        database = FirebaseDatabase.getInstance().reference
    }

    /*fun cargaFirebaseDummy(){
        val items: List<Item> = mutableListOf(
            Item("", "Leche", 15),
            Item("", "Pan", 1),
            Item("", "Pasta", 15),
            Item("", "Arroz", 3),
            Item("", "Frijol", 5)
        )
        items.forEach{
            val key = database.child("despensa").push().key
            it.id = key
            database.child("despensa").child(key!!).setValue(it)

        }
    }*/

    //Completa los siguientes métodos
    // y crea una pequeña interfaz en la app
    // para probar cada método.
    // Todas las salidas se ven en consola
    // Pueden usar: https://firebase.google.com/docs/database/android/start


    fun cargaUnItem(item: Item){
        val key = database.child("despensa").push().key
        item.id = key
        database.child("despensa").child(key!!).setValue(item)

    }


    fun borraUnItem(item:Item){

        var id = database.child("despensa" + item.id).toString()
        item.id = id
        database.child("despensa").child(item.id!!).removeValue()
    }

    fun borraTodo(){
        database.child("despensa").removeValue()
    }

    fun modificaUnItem( item: Item){
        var id = database.child("despensa" + item.id).toString()
        item.id = id
        database.child("despensa").child(item.id!!).setValue(item)
    }

    fun obtenTodos( ){

    }
}