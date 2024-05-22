package com.marion.androidtvapplication.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marion.androidtvapplication.databinding.VideoItemBinding
import com.marion.androidtvapplication.model.Video

class AdapterVideo(private val context: Context, private val listVideo: MutableList<Video>) :
    RecyclerView.Adapter<AdapterVideo.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val itemList = VideoItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return VideoViewHolder((itemList))
    }

    override fun getItemCount() = listVideo.size

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        listVideo[position].cover?.let { holder.coverImage.setImageResource(it) }
        holder.coverTitle.text = listVideo[position].title

        holder.itemView.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) holder.itemSelected.setBackgroundColor(Color.parseColor("#DDDDDD")) else holder.itemSelected.setBackgroundColor(Color.parseColor("#000000"))
        }
    }

    inner class VideoViewHolder(binding: VideoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val coverImage = binding.imageViewCover
        val coverTitle = binding.textViewCoverTitle
        val itemSelected = binding.viewBorderSelected
    }
}