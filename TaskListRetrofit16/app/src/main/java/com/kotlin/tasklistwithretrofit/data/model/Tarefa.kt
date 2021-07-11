package com.kotlin.tasklistwithretrofit.data.model

import com.google.gson.annotations.SerializedName

data class Tarefa(
    @SerializedName("id") var id: Int=0,
    @SerializedName("nome") val nome: String
)
