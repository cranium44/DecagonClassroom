package com.decagon.decagonclassroom.models

import java.util.*

data class Article(
    var title: String,
    var author: String,
    var date: Calendar = Calendar.getInstance()
)