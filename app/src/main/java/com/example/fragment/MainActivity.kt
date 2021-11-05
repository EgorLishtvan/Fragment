package com.example.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
                binding.bFrag2.setOnClickListener {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.place_halder, BlankFragment2.newInstance()).commit()
            }
                binding.bFrag2.setOnClickListener {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.place_halder, BlankFragment3.newInstance()).commit()
            }
                binding.bFrag2.setOnClickListener {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.place_halder, BlankFragment4.newInstance()).commit()
            }
    }
}