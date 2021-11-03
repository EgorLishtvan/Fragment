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
        setContentView(binding.root)
        var count=0
        while (count < 3) {
            if(count==0) {
                binding.bFrag2.setOnClickListener {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.place_halder, BlankFragment2.newInstance()).commit()
                    count+1
                }
            }
            if (count==1) {
                binding.bFrag2.setOnClickListener {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.place_halder, BlankFragment3.newInstance()).commit()
                    count+1
                }
            }
            if (count==2) {
                binding.bFrag2.setOnClickListener {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.place_halder, BlankFragment4.newInstance()).commit()
                    count+1
                }
            }
            else{
                count=0
            }
                    supportFragmentManager .
                    beginTransaction ().replace(R.id.place_halder, BlankFragment()).commit()
        }
    }

}