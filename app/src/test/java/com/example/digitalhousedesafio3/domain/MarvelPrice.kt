package com.example.digitalhousedesafio3.domain

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MarvelPrice  (
    @SerializedName("type") val type: String,
    @SerializedName("price") val price: Double
) : Serializable

