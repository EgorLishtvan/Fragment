package com.example.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragmentFirst : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_first, container, false)
    }

    companion object {
        const val TagFirst="com.example.fragment.BlankFragmentFirst"
        fun newInstance()=BlankFragmentFirst()

                }
            }