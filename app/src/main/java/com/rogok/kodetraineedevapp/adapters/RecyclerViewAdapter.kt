package com.rogok.kodetraineedevapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rogok.kodetraineedevapp.databinding.ItemUserBinding
import com.rogok.kodetraineedevapp.models.User
import java.util.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.UserViewHolder>() {
    private var users = ArrayList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holderUser: UserViewHolder, position: Int) {
        holderUser.bind()
    }

    override fun getItemCount() = users.size

    fun setNewData(newList: ArrayList<User>) {
        users = newList
        notifyDataSetChanged()
    }

    inner class UserViewHolder(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            binding.tvFirstName.text = users[adapterPosition].firstName
            binding.tvLastName.text = users[adapterPosition].lastName
            binding.tvPositionJob.text = users[adapterPosition].position
        }
    }
}
