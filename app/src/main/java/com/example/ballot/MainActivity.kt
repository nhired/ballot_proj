package com.example.ballot

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var  homeFragment: HomeFragment
    lateinit var repsFragment: RepsFragment
    lateinit var profileFragment: ProfileFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.btm_nav)

        //home frag is default frag when app is open

        homeFragment = HomeFragment()
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_layout, homeFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {

                R.id.bills_home -> {

                    homeFragment = HomeFragment()
                    supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.frame_layout, homeFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit()

                }

                R.id.reps -> {
                    repsFragment = RepsFragment()
                    supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.frame_layout, repsFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit()
                }

                R.id.profile -> {
                    profileFragment = ProfileFragment()
                    supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.frame_layout, profileFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit()

                }

            }

            true


        }


    }
}