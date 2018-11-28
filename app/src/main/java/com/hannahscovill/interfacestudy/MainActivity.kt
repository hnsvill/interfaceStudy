package com.hannahscovill.interfacestudy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), ExampleInterface {

    override fun thing1() {  //Because we are implementing ExampleInterface, we are showing that
        Toast.makeText(this, "You have called the method thing1 (ONE).", Toast.LENGTH_SHORT).show()
    }

    override fun thing2() {
        Toast.makeText(this, "You have called the method thing2 (TWO).", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myFragment = ExampleFragment()
        myFragment.interfaceRef = this
        supportFragmentManager.beginTransaction().replace(R.id.contentPanel, myFragment).commit() //this is where we are loading the fragment
    }

}
