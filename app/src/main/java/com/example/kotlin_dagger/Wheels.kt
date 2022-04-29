package com.example.kotlin_dagger

import javax.inject.Inject

class Wheels
{
    //@Inject
    lateinit var tires: Tires
    //@Inject
    lateinit var rims: Rims

    //@Inject
    constructor(tires: Tires,rims: Rims){
        this.tires=tires;
        this.rims=rims
    }





}