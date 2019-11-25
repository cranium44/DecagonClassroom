package com.decagon.decagonclassroom.models

import java.util.*

data class Book(
    var id: Int = Math.random().toInt(),
    var title: String,
    var author: String,
    var releaseDate: Date
)