package com.example.animate

import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import com.squareup.picasso.PicassoProvider

class MainActivity : AppCompatActivity() {
    lateinit var fadeIn:Animation
    lateinit var fadeOut:Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
         fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)

        var btnfadein = findViewById<Button>(R.id.btn_fadein)
        var btnfadeout = findViewById<Button>(R.id.btn_fadeout)
        var imageView = findViewById<ImageView>(R.id.imageView)
        Glide.with(this).load("https://img.search.brave.com/XVDU_cUJa76ButfYWWh604SxGtyT_sZgk-m6FRc77FM/rs:fit:1140:800:1/g:ce/aHR0cHM6Ly9zbmVh/a2VybmV3cy5jb20v/d3AtY29udGVudC91/cGxvYWRzLzIwMTkv/MDYvbmlrZS1haXIt/bWF4LTI3MC1yZWFj/dC1iYXVoYXVzLWFv/NDk3MS0wMDItNC5q/cGc").into(imageView);

        btnfadein.setOnClickListener {
            imageView.animation=fadeIn
            imageView.startAnimation(fadeIn)
        }
        btnfadeout.setOnClickListener() {
            imageView.animation=fadeOut
            imageView.startAnimation(fadeOut)
        }




    }


    }


