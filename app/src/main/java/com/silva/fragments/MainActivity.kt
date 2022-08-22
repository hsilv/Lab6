package com.silva.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentContainer: FragmentContainerView
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentContainer = findViewById(R.id.fragment_container_view_main)
        bottomNavigationView = findViewById(R.id.bottom_nav)
        setListeners()
    }

    fun setListeners(){
        bottomNavigationView.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_option_home -> setFragment(HomeFragment.newInstance("Sebastián Silva"))
                R.id.menu_option_search -> setFragment(SearchFragment())
            }
            true
        }
    }

    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragment_container_view_main, fragment)
        }
    }
}