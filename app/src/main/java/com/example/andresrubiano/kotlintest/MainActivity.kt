package com.example.andresrubiano.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.andresrubiano.kotlintest.classesAndFunctions.ClassExample
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message.text = "New welcome Message!"

        instantiateObjectWithoutConstructor()
        instantiateClassWithConstructorByDefaultAndSetUp()
        createSum()
    }

    private fun instantiateObjectWithoutConstructor() {
        ClassExample.ClassWithConstructorByDefault().showMessage()
    }

    private fun instantiateClassWithConstructorByDefaultAndSetUp() {
        ClassExample.ClassWithConstructorByDefaultAndSetUp(
                "This is a parameter of ClassWithConstructorByDefaultAndSetUp")
    }

    private fun createSum()  {
        ClassExample.SumClass(2, 2)
    }
}
