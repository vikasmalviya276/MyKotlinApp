package com.example.hi.mykotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun main(args: Array<String>) {

       var y:Int=10
        do{
            y=y+10;
        }while (y<=10)
        var x:Int = 0
        do {
            x = x + 10
            println("I am inside Do block---"+x)
        } while(x <= 50)

    }
}

class MyTestClass{
    private var name:String="vikas malviya";
    fun printme(){
        println("show jere "+name);
    }
}
class myClass {
    // property (data member)
    private var name: String = "Tutorials.point"

    // member function
    fun printMe() {
        print("You are at the best Learning website Named-"+name)
    }
}
fun main(args: Array<String>) {
    val obj = myClass() // create obj object of myClass class
    obj.printMe()

    var obj=MyTestClass()
    obj.printme()
}