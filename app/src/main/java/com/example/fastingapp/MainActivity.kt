package com.example.fastingapp

import android.os.Bundle
import android.widget.Button

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2

import com.example.fastingapp.ui.main.NumberAdapter



class MainActivity : FragmentActivity() {

    private lateinit var adapter: NumberAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var btnChange: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = NumberAdapter(this)
        viewPager = findViewById(R.id.view_pager)
        btnChange = findViewById(R.id.btnChange)
        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when(position){
                    0-> btnChange.text = "первая"
                    1->btnChange.text = "вторая"
                    2->btnChange.text = "третья"
                    3-> btnChange.text = "четвертая"
                }

            }
        })
    }
}