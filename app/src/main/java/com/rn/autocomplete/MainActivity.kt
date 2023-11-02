package com.rn.autocomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.rn.autocomplete.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cities = listOf<String> (
            "Caruaru",
            "Cabo de Santo Agostinho",
            "Recife",
            "São Paulo",
            "Santos",
            "Garanhuns",
            "Santa Cruz"
        )

        val adapter = CitySearchAdapter(this, android.R.layout.simple_dropdown_item_1line, cities)
        binding.actCities.setAdapter(adapter)

    }


}