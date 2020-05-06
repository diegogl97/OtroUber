package com.example.otrouber.fragmentos

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import com.example.otrouber.R
import com.example.otrouber.modelo.DespensaFirebase
import com.example.otrouber.modelo.Item
import kotlinx.android.synthetic.main.fragment_alta.*
import kotlinx.android.synthetic.main.fragment_baja.*

/**
 * A simple [Fragment] subclass.
 */
class BajaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_baja, container, false)
    }
    fun Context.hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        modify_button.setOnClickListener {
            val despensaFirebase = DespensaFirebase()
            val item = Item()
            item.id = ""
            item.cantidad = cantidad_edittext.text.toString().toInt()
            item.descripcion = description_edittext.text.toString()
            despensaFirebase.borraUnItem(item)
            context!!.hideKeyboard(it)
        }

        del_button.setOnClickListener {
            val despensaFirebase = DespensaFirebase()
            val item = Item()
            item.id = ""
            item.cantidad = cantidad_edittext.text.toString().toInt()
            item.descripcion = description_edittext.text.toString()
            despensaFirebase.modificaUnItem(item)
            context!!.hideKeyboard(it)
        }
    }
}
