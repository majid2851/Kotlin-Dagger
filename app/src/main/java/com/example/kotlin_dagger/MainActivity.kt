package com.example.kotlin_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity()
{
    @Inject
    lateinit var car1:Car

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var carComponent=DaggerCarComponent.create()
        carComponent.inject(this)

        car1.start()




    }


}