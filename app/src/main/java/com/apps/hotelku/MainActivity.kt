package com.apps.hotelku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.apps.hotelku.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adaptorDisaster = DisasterAdaptor(generateDummy()){ disaster ->
            val intenttoDetailActivity = Intent(this@MainActivity, DetailActivity::class.java)
            intenttoDetailActivity.putExtra("DISASTER_NAME", disaster.nameDisaster)
            intenttoDetailActivity.putExtra("DISASTER_TYPE", disaster.typeDisaster)
            intenttoDetailActivity.putExtra("DISASTER_IMAGE", disaster.imageUrl)
            intenttoDetailActivity.putExtra("DISASTER_COUNTRY", disaster.countryDisaster)
            startActivity(intenttoDetailActivity)
        }
        with(binding){
            rvDisaster.apply {
                adapter = adaptorDisaster
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }

    private fun generateDummy(): List<Disaster> {
        return listOf(
            Disaster(nameDisaster = "Anggora", typeDisaster = "Kucing Lucu", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/c/c8/Burmese_cat.jpg", "England"),
            Disaster(nameDisaster = "Persia", typeDisaster = "Kucing Imoet", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e9/Male_Burmilla_cat.jpeg", "Madagaskar"),
            Disaster(nameDisaster = "Jawa", typeDisaster = "Kucing Petarung", imageUrl = "https://upload.wikimedia.org/wikipedia/id/a/a4/Bramble.jpg", "Spanish"),
            Disaster(nameDisaster = "Aegea", typeDisaster = "Kucing Elite", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e4/Cymric_-_Norwegian_forest_cat_presentation_show_Kotka_2009-02-01_IMG_0687.JPG", "Indonesia"),
            Disaster(nameDisaster = "Manx", typeDisaster = "Kucing Aing Maung", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Aegean_Island_Cat.jpg/235px-Aegean_Island_Cat.jpg", "Yunani"),
            Disaster(nameDisaster = "Abisinia", typeDisaster = "Kucing Malas", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/f/f0/Cornish_rex.jpg", "Etiopia"),
        )
    }
}