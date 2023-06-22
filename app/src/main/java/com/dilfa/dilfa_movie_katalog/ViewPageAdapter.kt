package com.dilfa.dilfa_movie_katalog

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dilfa.dilfa_movie_katalog.model.Movie

class ViewPageAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle):
        FragmentStateAdapter(fragmentManager, lifecycle){

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when (position){
            0 -> fragment = MovieFragment()
            1 -> fragment = TVFragment()
        }
        return fragment
    }
}