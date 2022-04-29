package com.example.kotlin_dagger

import android.util.Log
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class WheelsModule
{


    @Provides
    fun providesWheels(rims:Rims,tires:Tires):Wheels{
        Log.i("mag2851","wheels module")
        return Wheels(tires,rims)
    }

    @Provides
    fun provideTires():Tires{
        return Tires()
    }

    @Provides
    fun provideRims():Rims{
        return Rims()
    }



}