package com.rogok.kodetraineedevapp.adapters

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rogok.kodetraineedevapp.ui.OneFragment

class ViewPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 13
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> {
                val data = bundleOf("position" to position)
                val oneFrag = OneFragment()
                oneFrag.arguments = data
                return oneFrag
            }
            else -> {
                Fragment()
            }
        }
    }
}