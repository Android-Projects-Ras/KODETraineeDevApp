package com.rogok.kodetraineedevapp.models

import com.google.gson.annotations.SerializedName

data class Items(
    @SerializedName("items" )
    val items : List<User>
)

data class User(
    val id: String,
    val avatarUrl: String,
    val firstName: String,
    val lastName: String,
    val userTag: String,
    val department: String,
    val position: String,
    val birthday: String,
    val phone: String
)
