package com.example.kotlin_dagger

import android.util.Log
import javax.inject.Inject

class Remote
{
    lateinit var car: Car

    @Inject
    constructor(){

    }

    fun provideCar(car: Car)
    {
        Log.i("mag2851","provide car")
        this.car=car
    }










}