package com.example.otrouber.fragmentos

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.otrouber.R
import com.example.otrouber.modelo.Item
import kotlinx.android.synthetic.main.*
import org.w3c.dom.Text


class DespensaRecyclerAdapter( private val list: List<Item>)
    : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item: Item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size

}

class ItemViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.renglon_item, parent, false)) {
        private var cantidadItemTextView: TextView? = null
    private var itemDescripcionTextView: TextView? = null


    init {
        cantidadItemTextView = itemView.findViewById(R.id.item_cantidad)
        itemDescripcionTextView = itemView.findViewById(R.id.item_descipcion)
    }

    fun bind(item: Item) {
        Log.i("Error despensa",item.cantidad.toString() )
        cantidadItemTextView?.text = item.cantidad.toString()
        itemDescripcionTextView?.text = item.descripcion
    }

}