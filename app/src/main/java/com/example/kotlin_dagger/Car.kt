package com.example.kotlin_dagger

import android.util.Log
import javax.inject.Inject

class Car
{
    lateinit var engine: Engine
    lateinit var wheels: Wheels

    @Inject
    constructor(engine: Engine, wheels: Wheels){
        this.engine=engine;
        this.wheels=wheels
    }

    fun start(){
        engine.start()
        Log.i("mag2851","driving....")
    }

}