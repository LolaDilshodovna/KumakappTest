package com.example.kumakapptest.screensMyDonation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kumakapptest.DataClassMyDon.DonationItems
import com.example.kumakapptest.adaptersMyDonScreen.DonationItemAdapter
import com.example.kumakapptest.R


class MyDonation_Screen : AppCompatActivity() {

    lateinit var DonationItems: MutableList<DonationItems>
    lateinit var DonationItemAdapter: DonationItemAdapter

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_donation_screen)

        var calendarView = findViewById<CalendarView>(R.id.calendarView)
        var donation_rec = findViewById<RecyclerView>(R.id.donation_rec)
        var seeAll = findViewById<TextView>(R.id.seeAll)


        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->

        }

        DonationItems = mutableListOf<DonationItems>()
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))
        DonationItems.add(DonationItems(R.drawable.donation_main_img, "$22", "Help victims of Flash", "$8,775", "$4,471", 9))



        DonationItemAdapter = DonationItemAdapter(DonationItems, this)

        donation_rec.adapter = DonationItemAdapter

        seeAll.setOnClickListener {
            val Intent = Intent(this, MyDonation2_Screen::class.java)
            startActivity(Intent)
        }



    }
}