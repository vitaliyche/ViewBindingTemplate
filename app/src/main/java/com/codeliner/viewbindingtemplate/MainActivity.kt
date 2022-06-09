package com.codeliner.viewbindingtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codeliner.viewbindingtemplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textHello.text = "Чао бамбино сеньорита"
    }
}