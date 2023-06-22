package com.dilfa.dilfa_movie_katalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.bumptech.glide.Glide
import com.dilfa.dilfa_movie_katalog.model.Movie
import kotlinx.android.synthetic.main.activity_tvdetail.*

class MovieDetail : AppCompatActivity() {

    companion object{
        const val EXTRA_MOVIES = "extra_movies"
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_movie_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        img_item_photo.clipToOutline = true

        val detailMovies = intent.getParcelableExtra<Movie>(EXTRA_MOVIES)

        if (detailMovies != null) {
            val IMAGE_BASE = "https://image.tmdb.org/t/p/w500"
            Glide.with(this).load(IMAGE_BASE + detailMovies.poster).into(img_item_photo)
            tv_item_name.text = detailMovies.title
            tv_item_desc.text = detailMovies.overview

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}