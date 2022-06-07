package com.example.animationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    initView()
    }
    fun initView(){
        image=findViewById(R.id.image)

        var bounce:Button=findViewById(R.id.bounce)
        bounce.setOnClickListener{
            var animation:Animation=AnimationUtils.loadAnimation(applicationContext,R.anim.bounce)
            image.startAnimation(animation)
        }

        var sequential:Button=findViewById(R.id.sequential)
        sequential.setOnClickListener{
            var animation=AnimationUtils.loadAnimation(applicationContext,R.anim.sequential)
            image.startAnimation(animation)
        }


        var togather:Button=findViewById(R.id.togather)
        togather.setOnClickListener{
            var animation=AnimationUtils.loadAnimation(applicationContext,R.anim.togather)
            image.startAnimation(animation)
        }
    }
}