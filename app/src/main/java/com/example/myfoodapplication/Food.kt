package com.example.myfoodapplication

import java.io.Serializable

data class Food(
    var name: String = "",
    var country: String = "",
    var detail: String = "",
    var photo: Int = 0,
    var recipe: String = "",
    var tools: String = ""
) : Serializable
