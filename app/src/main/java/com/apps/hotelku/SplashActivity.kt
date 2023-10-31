package com.apps.hotelku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.apps.hotelku.databinding.ActivityDetailBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            Handler().postDelayed({
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000)
        }
    }
}