package com.decagon.decagonclassroom.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.decagon.decagonclassroom.R
import com.decagon.decagonclassroom.models.Video

class VideosAdapter(var data: ArrayList<Video>) :
    RecyclerView.Adapter<VideosAdapter.VideoViewHolder>() {
    class VideoViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.videos_row, parent, false)
        return VideoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {

    }

}