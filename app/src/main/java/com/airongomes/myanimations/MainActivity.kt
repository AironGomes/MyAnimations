package com.airongomes.myanimations

import android.animation.*
import android.content.Intent
import android.graphics.Point
import android.graphics.Rect
import android.graphics.RectF
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageFragment = FragmentImage()

        findViewById<ImageView>(R.id.image1).setOnClickListener {
            imageFragment.setImage = R.drawable.image1
            supportFragmentManager
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .add(R.id.container, imageFragment)
                .commit()
        }

        findViewById<ImageView>(R.id.image2).setOnClickListener {
            imageFragment.setImage = R.drawable.image2
            supportFragmentManager
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .add(R.id.container, imageFragment)
                .commit()
        }

        findViewById<ImageView>(R.id.image3).setOnClickListener {
            imageFragment.setImage = R.drawable.image3
            supportFragmentManager
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .add(R.id.container, imageFragment)
                .commit()
        }
    }

}