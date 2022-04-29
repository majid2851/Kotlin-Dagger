package com.example.kotlin_dagger

import dagger.Component
import dagger.Module
import javax.inject.Inject

@Component(modules = [PetrolEngineModule::class,WheelsModule::class])
interface CarComponent
{

    fun getCar():Car

    fun inject(mainActivity: MainActivity)



}