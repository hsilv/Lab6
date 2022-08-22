package com.silva.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    private lateinit var buttonFirst: Button
    private lateinit var buttonSecond: Button
    private lateinit var buttonNav: Button
    private lateinit var fragmentContainer: FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFirst = findViewById(R.id.first_button)
        buttonSecond = findViewById(R.id.second_button)
        buttonNav = findViewById(R.id.nav_button)
        fragmentContainer = findViewById(R.id.fragment_container_view_first)
        setListeners()
    }

    private fun setListeners(){
        buttonFirst.setOnClickListener{
            setFragment(FirstFragment())
        }
    }
    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragment_container_view_first, fragment)
        }
    }
}