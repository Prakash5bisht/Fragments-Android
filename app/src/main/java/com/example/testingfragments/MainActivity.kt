package com.example.testingfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

val TAG = "Prakash"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = FragmentOne()
        val fragmentTwo = FragmentTwo()

        var logIn : Button = findViewById(R.id.Button2)
        var signIn : Button = findViewById(R.id.Button1)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.myFragment, fragmentOne)
            commit()
            Log.d(TAG, "default Fragment")
        }

        logIn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.myFragment, fragmentTwo)
              //  add(R.id.myFragment, fragmentTwo, "addCalled")
                addToBackStack("logInn")
                commit()
                Log.d(TAG, "Login Fragment")
            }
        }

        signIn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.myFragment, fragmentOne)
                addToBackStack("signIn")
                commit()
                Log.d(TAG, "SignIn Fragment")
            }

        }
    }
}