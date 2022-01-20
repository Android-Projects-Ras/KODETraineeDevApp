package com.rogok.kodetraineedevapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.rogok.kodetraineedevapp.R
import com.rogok.kodetraineedevapp.adapters.RecyclerViewAdapter
import com.rogok.kodetraineedevapp.databinding.FragmentOneBinding
import com.rogok.kodetraineedevapp.models.User
import java.util.*

const val ARG_OBJECT = "object"

class OneFragment : Fragment(R.layout.fragment_one) {

    private val viewModel = FragmentOneVM()
    private val recyclerAdapter = RecyclerViewAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding: FragmentOneBinding = FragmentOneBinding.bind(view)

        binding.rvFragOne.adapter = recyclerAdapter
        viewModel.users.observe(viewLifecycleOwner, { users ->

            val position = arguments?.getInt("position")
            when (position) {
                0 -> recyclerAdapter.setNewData(users as ArrayList<User>)
                1 -> {
                    val designers = users.filter { it.department == "design" }
                    recyclerAdapter.setNewData(designers as ArrayList<User>)
                }
                2 -> {
                    val analysts = users.filter { it.department == "analytics" }
                    recyclerAdapter.setNewData(analysts as ArrayList<User>)
                }
                3 -> {
                    val managers = users.filter { it.department == "management" }
                    recyclerAdapter.setNewData(managers as ArrayList<User>)
                }
                4 -> {
                    val iOSUsers = users.filter { it.department == "ios" }
                    recyclerAdapter.setNewData(iOSUsers as ArrayList<User>)
                }
                5 -> {
                    val androiders = users.filter { it.department == "android" }
                    recyclerAdapter.setNewData(androiders as ArrayList<User>)
                }
                6 -> {
                    val support = users.filter { it.department == "support" }
                    recyclerAdapter.setNewData(support as ArrayList<User>)
                }
                7 -> {
                    val prs = users.filter { it.department == "pr" }
                    recyclerAdapter.setNewData(prs as ArrayList<User>)
                }
                8 -> {
                    val backenders = users.filter { it.department == "backend" }
                    recyclerAdapter.setNewData(backenders as ArrayList<User>)
                }
                9 -> {
                    val frontenders = users.filter { it.department == "frontend" }
                    recyclerAdapter.setNewData(frontenders as ArrayList<User>)
                }
                10 -> {
                    val hrs = users.filter { it.department == "hr" }
                    recyclerAdapter.setNewData(hrs as ArrayList<User>)
                }
                11 -> {
                    val qa = users.filter { it.department == "qa" }
                    recyclerAdapter.setNewData(qa as ArrayList<User>)
                }
                12 -> {
                    val back_office = users.filter { it.department == "back_office" }
                    recyclerAdapter.setNewData(back_office as ArrayList<User>)
                }
            }
        })
    }
}