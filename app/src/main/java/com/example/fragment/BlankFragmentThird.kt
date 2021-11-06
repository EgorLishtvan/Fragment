package com.example.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragmentThird : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_third, container, false)
    }

    companion object {
        const val TagThird="com.example.fragment.BlankFragmentThird"
        fun newInstance()=BlankFragmentThird()
                }
            }
