package com.example.apptugas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apptugas.databinding.ActivityMainBinding
import com.example.apptugas.databinding.AnimeBinding

class AnimeAdapter(val data: (DataItem)-> Unit):ListAdapter<DataItem, AnimeAdapter.AnimeViewHolder>(DIFF_CALLBACK){
    inner class AnimeViewHolder(
        private val binding: AnimeBinding
    ):RecyclerView.ViewHolder(binding.root){
        fun bind(dataItem: DataItem){
            val episodes = dataItem.attributes?.episodeCount.toString()
            binding.apply {
                Glide.with(itemView.context).load(dataItem.attributes?.posterImage?.original).into(ivCover)
                tvTitle.text = dataItem.attributes?.titles?.enJp
                tvRating.text = dataItem.attributes?.averageRating
                tvEpisode.text = "Episode $episodes"

                }
            itemView.setOnClickListener{
                data.invoke(dataItem)
            }

            }
        }
    companion object{
        val DIFF_CALLBACK = object :DiffUtil.ItemCallback<DataItem>(){
            override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val binding = AnimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}