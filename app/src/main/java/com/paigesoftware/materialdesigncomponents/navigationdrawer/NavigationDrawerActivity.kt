package com.paigesoftware.materialdesigncomponents.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_navigation_drawer.*

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    val frag1 = NavDrawerFrag1()
    val frag2 = NavDrawerFrag2()
    val frag3 = NavDrawerFrag3()
    val frag4 = NavDrawerFrag4()
    val frag5 = NavDrawerFrag5()
    val frag6 = NavDrawerFrag6()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)

        setSupportActionBar(navigation_drawer_toolbar)
        title = "NavigationDrawerActivity"

        val actionBarDrawerToggle = ActionBarDrawerToggle(this, navigation_drawer_layout, navigation_drawer_toolbar, R.string.open, R.string.close)
        navigation_drawer_layout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        navigation_view.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.navigation_drawer_nav1 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.framelayout_navigation_drawer_container, frag1)
                    .commit()

            }
            R.id.navigation_drawer_nav2 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.framelayout_navigation_drawer_container, frag2)
                    .commit()

            }
            R.id.navigation_drawer_nav3 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.framelayout_navigation_drawer_container, frag3)
                    .commit()

            }
            R.id.navigation_drawer_nav4 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.framelayout_navigation_drawer_container, frag4)
                    .commit()

            }
            R.id.navigation_drawer_nav5 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.framelayout_navigation_drawer_container, frag5)
                    .commit()

            }
            R.id.navigation_drawer_nav6 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.framelayout_navigation_drawer_container, frag6)
                    .commit()

            }
        }

        val drawerLayout = navigation_drawer_layout
        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        }

        return false
    }


}