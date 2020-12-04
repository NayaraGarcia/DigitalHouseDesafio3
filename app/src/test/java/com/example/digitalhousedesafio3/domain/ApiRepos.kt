package com.example.digitalhousedesafio3.domain

import com.google.gson.annotations.SerializedName

data class ApiRepos <T> (
    @SerializedName("data") val data: ApiDat <T>
)