package com.apps.hotelku

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailActivity: AppCompatActivity(){
    private lateinit var rooms: String
    private lateinit var image: ImageView
    private lateinit var rname: TextView
    private lateinit var desc: TextView
    private lateinit var facility: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent: Intent = intent
        rooms = intent.getStringExtra("room").toString()
        rname = findViewById(R.id.roomname)
        desc = findViewById(R.id.txtSuite)
        facility = findViewById(R.id.txtfacility)

        if(rooms == "46m") {
            rname.setText("Suite Room")
            facility.setText("AC, Wifi, Breakfast, GYM")
        } else {
            rname.setText("Luxury Room")
            image = findViewById(R.id.imagemsuite)
            image.setImageResource(R.drawable.double_bed)
            desc.setText(R.string.desc2)
            facility.setText("AC, Wifi, Breakfast, GYM, Spa, Premium Service, Swimming Pool, Bar")
        }
    }
}