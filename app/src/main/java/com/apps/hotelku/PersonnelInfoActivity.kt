package com.apps.hotelku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PersonnelInfoActivity : AppCompatActivity() {
    private lateinit var edAddress: EditText
    private lateinit var edName: EditText
    private lateinit var edPhone: EditText
    private lateinit var edNumber: EditText
    private lateinit var btnNext: Button
    private lateinit var emails: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_info)

        val i: Intent = intent
        emails = i.getStringExtra("emails").toString()

        btnNext = findViewById(R.id.bntNext)
        edAddress = findViewById(R.id.edAddress)
        edName = findViewById(R.id.edName)
        edPhone = findViewById(R.id.edPhone)
        edNumber = findViewById(R.id.edNumber)

        btnNext.setOnClickListener {
            Toast.makeText(
                this@PersonnelInfoActivity, "hello " + edName.text.toString(),
                Toast.LENGTH_LONG
            ).show()
            val i = Intent(this@PersonnelInfoActivity, RoomInfoActivity::class.java)
            i.putExtra("name", edName.text.toString())
            i.putExtra("address", edAddress.text.toString())
            i.putExtra("phone", edPhone.text.toString())
            i.putExtra("numberofperson", edNumber.text.toString())
            startActivity(i)
        }
    }
}
