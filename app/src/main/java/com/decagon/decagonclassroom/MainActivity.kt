package com.decagon.decagonclassroom

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment()
        val curriculumFragment = CurriculumFragment()
        val resourcesFragment = ResourcesFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.layout_fragment_container, homeFragment)
            .commit()
        bottom_navigation_view.selectedItemId = R.id.home_nav


        bottom_navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home_nav -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.layout_fragment_container, homeFragment)
                        .commit()
                    true
                }
                R.id.profile_nav -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.layout_fragment_container, profileFragment)
                        .commit()
                    true
                }
                R.id.curriculum_nav -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.layout_fragment_container, curriculumFragment)
                        .commit()
                    true
                }
                R.id.resources_nav -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.layout_fragment_container, resourcesFragment)
                        .commit()
                    true
                }
                else -> {
                    false
                }
            }
        }

    }


}
