package com.example.kumakapptest.screensMyDonation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.kumakapptest.DataClassMyDon.DonationItems
import com.example.kumakapptest.adaptersMyDonScreen.DonationItemAdapter2
import com.example.kumakapptest.R

class MyDonation2_Screen : AppCompatActivity() {

    lateinit var DonationItems: MutableList<DonationItems>
    lateinit var DonationItemAdapter2: DonationItemAdapter2

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_donation2_screen)


        var donation_rec = findViewById<RecyclerView>(R.id.donation2_rec)
        var back = findViewById<ImageView>(R.id.back)


        DonationItems = mutableListOf<DonationItems>()
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))



        DonationItemAdapter2 = DonationItemAdapter2(DonationItems, this)

        donation_rec.adapter = DonationItemAdapter2


        back.setOnClickListener {
            var intent = Intent(this, MyDonation_Screen::class.java)
            startActivity(intent)
        }

    }
}