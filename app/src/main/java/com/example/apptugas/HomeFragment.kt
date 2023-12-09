package com.example.apptugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apptugas.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding
    private lateinit var animeAdapter: AnimeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
       _binding= FragmentHomeBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getAnime()
    }

    private fun getAnime(){
        val client = ApiConfig.getRetrofit().getAnime()
        client.enqueue(object: retrofit2.Callback<AnimeResponse>{
            override fun onResponse(call: Call<AnimeResponse>, response: Response<AnimeResponse>) {
                if (response.isSuccessful){
                    val responseBody = response.body()
                    if (responseBody != null){
                        setupRecycleView(responseBody.data)
                    }
                }
            }

            override fun onFailure(call: Call<AnimeResponse>, t: Throwable) {
                Toast.makeText(requireActivity(), t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setupRecycleView(listAnime:List<DataItem>
    ) {
        animeAdapter = AnimeAdapter{navigateToDetail(it)}
        binding?.rvAnime?.apply {
            layoutManager = GridLayoutManager(requireActivity(),2)
            adapter = animeAdapter
        }
        animeAdapter.submitList(listAnime)
    }

    private fun navigateToDetail(dataItem: DataItem){
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(dataItem)
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}