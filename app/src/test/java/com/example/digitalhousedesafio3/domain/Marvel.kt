package com.example.digitalhousedesafio3.domain

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Marvel (
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("pageCount") val pageCount: Int,
    @SerializedName("dates") @Expose val dates: ArrayList<MarvelDat>,
    @SerializedName("prices") @Expose val prices: ArrayList<MarvelPrice>,
    @SerializedName("images") @Expose val images: ArrayList<MarvelImg>
) : Serializable {

}