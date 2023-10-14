package com.apps.hotelku

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var btnEnviar: Button
    private lateinit var username: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val information = intent.getStringExtra("Info")
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = "Room Chosen: "+information

        btnEnviar = findViewById(R.id.btnSend)
        username = findViewById(R.id.edEmail)
        password = findViewById(R.id.edPassword)
        btnEnviar.setOnClickListener {
            if(checkValidasi(username.text.toString(), password.text.toString())) {
                val i = Intent(this@LoginActivity, PersonnelInfoActivity::class.java)
                i.putExtra("emails", username.text.toString())
                startActivity(i)
            } else {
                Toast.makeText(
                    this@LoginActivity,
                    "Invalid ${username.text.toString()}" +
                            " password, please check the input.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun checkValidasi(username: String, password: String): Boolean {
        val user = listOf(
            Pair("xhienkunlol1@gmail.com", "test"),
            Pair("mitsukinanami34@gmail.com", "user"),
        )
        for ((email, pass) in user) {
            if(username == email && password == pass) {
                return true
            }
        }
        return false
    }
}
