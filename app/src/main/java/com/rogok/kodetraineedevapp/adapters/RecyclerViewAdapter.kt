package com.rogok.kodetraineedevapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rogok.kodetraineedevapp.R
import com.rogok.kodetraineedevapp.models.User
import java.util.ArrayList

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private var users = ArrayList<User>()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val firstName = holder.itemView.findViewById<TextView>(R.id.tvFirstName)
        val lastName = holder.itemView.findViewById<TextView>(R.id.tvLastName)
        val positionJob = holder.itemView.findViewById<TextView>(R.id.tvPositionJob)

        firstName.text = users[position].firstName
        lastName.text = users[position].lastName
        positionJob.text = users[position].position

    }

    override fun getItemCount() = users.size

    fun setNewData(newList: ArrayList<User>) {
        users = newList
        notifyDataSetChanged()
    }
}
