package com.example.apptugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.apptugas.databinding.FragmentDetailBinding
import com.example.apptugas.databinding.FragmentHomeBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener


class DetailFragment : Fragment() {
    private var _binding : FragmentDetailBinding? = null
    private val binding get() = _binding
    private val navArgs by navArgs<DetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
    }

    private fun setUpView() {
        val detailArgs = navArgs.dataItem
        binding?.apply {
            Glide.with(requireActivity()).load(detailArgs.attributes?.coverImage?.original).into(ivDetailAnime)
            tvTitle.text = detailArgs.attributes?.titles?.enJp
            tvRating.text = detailArgs.attributes?.averageRating
            tvEpisode.text = "Episode ${detailArgs.attributes?.episodeCount}"
            tvSynopsis.text = detailArgs.attributes?.synopsis
        }

        setUpYoutubeApi(detailArgs)

    }

    private fun setUpYoutubeApi(dataItem: DataItem){
        binding?.apply {
            lifecycle.addObserver(ytPlayer)
            ytPlayer.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    val videoId = dataItem.attributes?.youtubeVideoId
                    if (videoId != null) {
                        youTubePlayer.loadVideo(videoId,0f)
                    }
                }
            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
