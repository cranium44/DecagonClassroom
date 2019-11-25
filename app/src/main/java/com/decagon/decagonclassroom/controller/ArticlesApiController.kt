package com.decagon.decagonclassroom.controller

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.decagon.decagonclassroom.data.URL
import com.decagon.decagonclassroom.models.Article
import org.json.JSONObject

class ArticlesApiController {


    companion object {
        private lateinit var requestQueue: RequestQueue
        private var data = ArrayList<Article>()
        fun getArticles(context: Context): ArrayList<Article> {
            requestQueue = Volley.newRequestQueue(context)
            var jsonObjectRequest = JsonObjectRequest(
                Request.Method.GET,
                URL.BASE_URL + URL.ARTICLE_INFO,
                null,
                Response.Listener<JSONObject> {
                    data.add(
                        Article(
                            it.getString("title"),
                            it.getString("author")
                        )
                    )
                }, Response.ErrorListener {
                    Log.e("ArticleAPI", it.message.toString())
                })

            requestQueue.add(jsonObjectRequest)
            return data
        }
    }


}