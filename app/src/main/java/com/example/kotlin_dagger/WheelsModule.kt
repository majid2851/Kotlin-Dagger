package com.example.kotlin_dagger

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class WheelsModule
{
    @Provides
    fun providesWheels():Wheels{
        Log.i("mag2851","wheels module")
        return Wheels()
    }




}