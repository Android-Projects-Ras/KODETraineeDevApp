package com.rogok.kodetraineedevapp.data

import com.rogok.kodetraineedevapp.models.Items
import com.rogok.kodetraineedevapp.models.User
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Items
}