package com.apps.hotelku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var btnDetalhesSuite: Button
    private lateinit var btnSuite: Button
    private lateinit var imagebtn: ImageView
    private lateinit var imagebtn2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDetalhesSuite = findViewById(R.id.btnDetailsSuite)
        btnDetalhesSuite.setOnClickListener {
            val i = Intent(this@MainActivity, LoginActivity::class.java)
            i.putExtra("Info", "Suíte ")
            startActivity(i)
        }
        btnSuite = findViewById(R.id.btnCoverageDetail)
        btnSuite.setOnClickListener {
            val i = Intent(this@MainActivity, LoginActivity::class.java)
            i.putExtra("Info", "Luxury ")
            startActivity(i)
        }
        imagebtn = findViewById(R.id.imagemsuite)
        imagebtn.setOnClickListener {
            val i = Intent(this@MainActivity, DetailActivity::class.java)
            i.putExtra("room", "46m")
            startActivity(i)
        }
        imagebtn2 = findViewById(R.id.PenthouseimagemSuite)
        imagebtn2.setOnClickListener {
            val i = Intent(this@MainActivity, DetailActivity::class.java)
            i.putExtra("room", "100m")
            startActivity(i)
        }
    }
}
