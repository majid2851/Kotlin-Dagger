package com.example.kotlin_dagger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule
{
    @Binds
    abstract fun providePatrolEngine(petrolEngine:PetrolEngine):Engine



}