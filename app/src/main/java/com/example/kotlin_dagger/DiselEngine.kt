package com.example.kotlin_dagger

import android.util.Log
import javax.inject.Inject

class DiselEngine:Engine
{
    @Inject
    constructor()

    override fun start() {
        Log.i("mag2851","start diselEngine...")
    }


}