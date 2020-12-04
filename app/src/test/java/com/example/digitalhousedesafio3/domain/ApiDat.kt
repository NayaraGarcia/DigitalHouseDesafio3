package com.example.digitalhousedesafio3.domain

import com.google.gson.annotations.SerializedName

data class ApiDat <T> (
    @SerializedName("offset") val offset: Int,
    @SerializedName("limit") val limit: Int,
    @SerializedName("total") val total: Int,
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: ArrayList<T>
)
