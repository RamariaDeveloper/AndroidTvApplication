package com.marion.androidtvapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.marion.androidtvapplication.adapter.AdapterVideo
import com.marion.androidtvapplication.databinding.ActivityStreamingListBinding
import com.marion.androidtvapplication.model.Video

class StreamingList : AppCompatActivity() {

    private lateinit var binding: ActivityStreamingListBinding
    private lateinit var adapterVideo: AdapterVideo
    private val videosList: MutableList<Video> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStreamingListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewVideos = binding.rvVideos
        recyclerViewVideos.layoutManager = GridLayoutManager(this, 3)
        recyclerViewVideos.setHasFixedSize(true)
        adapterVideo = AdapterVideo(this, videosList)
        recyclerViewVideos.adapter = adapterVideo
        getVideos()

        /*enableEdgeToEdge()
        setContentView(R.layout.activity_streaming_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }

    private fun getVideos(){
        val video1 = Video(R.drawable.kiss, "KISS Cover Burning Fest 2024")
        videosList.add(video1)
        val video2 = Video(R.drawable.acdc, "ACDC Cover Burning Fest 2024")
        videosList.add(video2)
        val video3 = Video(R.drawable.iron, "Iron Maiden Cover Woodstock Bar 2024")
        videosList.add(video3)
        val video4 = Video(R.drawable.soad, "System of a Down Cover Manifesto 2024")
        videosList.add(video4)
        val video5 = Video(R.drawable.metallica, "Metallica Cover Morrison Rock Bar 2024")
        videosList.add(video5)
        val video6 = Video(R.drawable.megadeath, "Megadeath Cover Santo Rock Bar 2024")
        videosList.add(video6)
        val video7 = Video(R.drawable.foo, "Foo Fighters Cover Santo Rock Bar 2024")
        videosList.add(video7)
        val video8 = Video(R.drawable.lp, "Linkin Park Cover Manifesto 2024")
        videosList.add(video8)
        val video9 = Video(R.drawable.garbage, "Garbage Cover Santo Rock Bar 2024")
        videosList.add(video9)

    }
}