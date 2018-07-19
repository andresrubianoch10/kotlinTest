package com.example.andresrubiano.kotlintest.classesAndFunctions

import android.util.Log
import android.widget.Toast

/**
 * Every class extends from <b>Any</b> (Similar to Object in JAVA).
 * Class are <b>closed</b> by default (final)
 * We only can extends from a class if it is <b>open</b> or <b>abstract</b>
 * <b>Unit</b> is the equivalent of <b>void</b> in JAVA. When we've a method and any value
 * is returned, Kotlin by default return a <b>Unit</b> value.
 */
class ClassExample {

    companion object {
        const val TAG_CLASS_EXAMPLE = "classExample"
    }
    /**
     * Class with constructor by default
     */
    open class ClassWithConstructorByDefault {
        open fun showMessage() {
            Log.d(TAG_CLASS_EXAMPLE, "ClassWithConstructorByDefault")
        }
    }

    /**
     * Class with constructor by default and write on it
     */
    open class ClassWithConstructorByDefaultAndSetUp(parameter: String) {
        init {
            //This is the space if we're creating a java class with constructor
            Log.v(TAG_CLASS_EXAMPLE, parameter)
        }
    }

    /**
     * We can pass parameter using this format: <<varName>>: <<Type Variable>>
     */
    class ClassWithParameters(name: String, surname: String, age: Int)

    /**
     * Class father with Inheritance
     */
    open class ClassFather(name: String)

    /**
     * We can extends from a class when put two points at the end and pass the correct parameters
     * needed.
     */
    class ClassSon(firstName: String, lastName: String) : ClassFather(firstName)

    /**
     * Other case of inheritance
     * Braces '()' at the end of <b>ClassfatherTwo</b> is equivalent to call super() in JAVA.
     */
    abstract class ClassFatherTwo
    class ClassSonTwo : ClassFatherTwo() {
        init {

        }
    }

    /**
     * Using methods
     */
    inner class SumClass(x: Int, y: Int) {

        init {
            val total = sumValues(x, y)
            Log.v("Sum", x.toString() + " + " + y.toString() + " = " + total)
        }

        fun sumValues(x: Int, y: Int) : Int {
            return x + y
        }

        fun substraction(x: Int, y: Int) : Int = x + y

        fun messageToast(message: String, length: Int = Toast.LENGTH_SHORT) {
            //TODO find our a way to use context in an inner class
            //Toast.makeText(, message, length)
        }
    }


}
