package com.rogok.kodetraineedevapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.rogok.kodetraineedevapp.adapters.ViewPagerAdapter
import com.rogok.kodetraineedevapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, this.lifecycle)
        binding.pager.adapter = viewPagerAdapter
        TabLayoutMediator(binding.tabs, binding.pager) { tab, position ->
            when (position) {
                0 -> tab.text = "Everybody"
                1 -> tab.text = "Designers"
                2 -> tab.text = "Analysts"
                3 -> tab.text = "Managers"
                4 -> tab.text = "iOS"
                5 -> tab.text = "Android"
                6 -> tab.text = "Support"
                7 -> tab.text = "PR"
                8 -> tab.text = "Backend"
                9 -> tab.text = "Frontend"
                10 -> tab.text = "HR"
                11 -> tab.text = "QA"
                12 -> tab.text = "Back-office"
            }

        }.attach()
    }
}