package com.hannahscovill.interfacestudy

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ExampleFragment : Fragment() {

    lateinit var interfaceRef : ExampleInterface //this brings in the activity that in brought the activity into

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.example_inheritimplement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        interfaceRef.thing1() //only here to show that we can call them
        Handler().postDelayed({interfaceRef.thing2()}, 4000)
        interfaceRef.eat()
    }

}