package com.example.kotlin_dagger

import dagger.Module
import dagger.Provides

@Module
class DiselEngineModule
{
    @Provides
    fun provideDiselEngine(disel:DiselEngine):Engine{
        return disel
    }






}