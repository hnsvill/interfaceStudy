package com.hannahscovill.interfacestudy

import android.widget.Toast

interface ExampleInterface {  //You can name generic functions that you know will be used differently
    fun thing1()
    fun thing2()
    fun eat(){
        for (i in 0..100) {
            println("*********************CHEW*********************" + i.toString())
        }
    }
}