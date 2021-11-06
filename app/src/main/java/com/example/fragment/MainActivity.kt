package com.example.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.fragment.BlankFragmentFirst.Companion.TagFirst
import com.example.fragment.BlankFragmentSecond.Companion.TagSecond
import com.example.fragment.BlankFragmentThird.Companion.TagThird
import com.example.fragment.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()

        bFrag2.setOnClickListener {
            replaceNextFragment()
        }

    }
    private fun replaceNextFragment() {
        when{
            supportFragmentManager.findFragmentByTag(TagFirst) != null ->
                replaceFragment(BlankFragmentSecond.newInstance(), TagSecond)

            supportFragmentManager.findFragmentByTag(TagFirst) != null ->
                replaceFragment(BlankFragmentThird.newInstance(), TagSecond)

            supportFragmentManager.findFragmentByTag(TagSecond) != null ->
                replaceFragment(BlankFragmentThird.newInstance(), TagThird)

            else ->
                replaceFragment(BlankFragmentFirst.newInstance(), TagFirst)

        }
    }

    private fun replaceFragment(fragment: Fragment, tag: String) {
        supportFragmentManager

            .beginTransaction()
            .replace(R.id.place_halder, fragment, tag)
            .commit()
    }
}