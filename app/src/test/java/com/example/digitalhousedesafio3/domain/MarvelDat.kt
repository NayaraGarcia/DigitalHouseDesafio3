package com.example.digitalhousedesafio3.domain

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class MarvelDat (
    @SerializedName("date") val date: Date,
    @SerializedName("type") val type: String
) : Serializable