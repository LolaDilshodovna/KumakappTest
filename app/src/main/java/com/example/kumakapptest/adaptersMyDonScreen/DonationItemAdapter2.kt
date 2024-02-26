package com.example.kumakapptest.adaptersMyDonScreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kumakapptest.screensMyDonation.MyDonation2_Screen
import com.example.kumakapptest.R
import com.example.kumakapptest.DataClassMyDon.DonationItems

class DonationItemAdapter2(var list: MutableList<DonationItems>, MyDonationScreen2_Screen: MyDonation2_Screen): RecyclerView.Adapter<DonationItemAdapter2.MyHolder>() {

    var onItemClick : ((DonationItems) -> Unit)? = null

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var mainphoto: ImageView = itemView.findViewById<ImageView>(R.id.mainPhoto)
        var donated: TextView = itemView.findViewById<TextView>(R.id.donated)
        var help: TextView = itemView.findViewById<TextView>(R.id.help)
        var raised: TextView = itemView.findViewById<TextView>(R.id.raised)
        var donators: TextView = itemView.findViewById<TextView>(R.id.donators)
        var days: TextView = itemView.findViewById<TextView>(R.id.days)

    }


    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var item = list[position]
        holder.mainphoto.setImageResource(item.mainphoto)
        holder.donated.text = item.donated.toString()
        holder.help.text = item.help
        holder.raised.text = item.raised.toString()
        holder.donators.text = item.donators.toString()
        holder.days.text = item.days.toString()

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var itemView = MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_donation_item, parent, false))
        return itemView
    }


    override fun getItemCount(): Int {
        return list.size
    }

}