package com.example.otrouber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.otrouber.modelo.DespensaFirebase
import com.example.otrouber.modelo.Item

class MainActivity : AppCompatActivity() {

    private val despensaFirebase : DespensaFirebase = DespensaFirebase()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //despensaFirebase.cargaFirebaseDummy()
    }

    fun agregaItem(view : View){
        despensaFirebase.cargaUnItem(Item("", "Leche", 15))
    }

    fun borraItem(view : View){
        despensaFirebase.borraUnItem(Item("", "leche", 15))
    }

    override fun onResume() {
        super.onResume()
    }
}
