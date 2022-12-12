package com.example.polygon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.polygon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel : MainActivityViewModel
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = MainActivityViewModel()
        lifecycleScope.launchWhenCreated {
            viewModel.queryStocks("a")
        }



    }
}