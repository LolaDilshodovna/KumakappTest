package com.example.kumakapptest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kumakapptest.DataClassMyFun.ButtonItem
import com.example.kumakapptest.screenMyFundraising.MyFundraising_Screen

class ButtonAdapter(val listbutton: MutableList<ButtonItem>, MyFundraising_Screen: MyFundraising_Screen): RecyclerView.Adapter<ButtonAdapter.MyHolder>() {

    var onItemClick : ((ButtonItem) -> Unit)? = null
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var nameb: TextView = itemView.findViewById<TextView>(R.id.nameb)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ButtonAdapter.MyHolder {
        var itemView = MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.button_item, parent, false))
        return itemView
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var item = listbutton[position]
        holder.nameb.text = item.text

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(item)
        }
    }

    override fun getItemCount(): Int {
        return listbutton.size
    }

}