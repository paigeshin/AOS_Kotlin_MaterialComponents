package com.paigesoftware.materialdesigncomponents.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_bottom_navigation_view.*

class BottomNavigationViewActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private val frag1 = FragBottomNav1()
    private val frag2 = FragBottomNav2()
    private val frag3 = FragBottomNav3()

    companion object {
        private const val TAG = "BottomNavigationViewAct"
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_view)

        //NavigationView.OnNavigationItemSelectedListener
        bottom_navigation_view.setOnNavigationItemSelectedListener(this)

        //초기 선택. default는 무조건 0이다. 이미 선택되어 있음
        bottom_navigation_view.selectedItemId = R.id.bottom_nav1
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.d(TAG, "Selected, ${item.menuInfo}")

        when(item.itemId) {
            R.id.bottom_nav1 -> {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.bottom_nav_fade_in, R.anim.bottom_nav_fade_out)
                    .replace(R.id.framelayout_bottom_navigation_view_container, frag1)
                    .commit()
                return true
            }
            R.id.bottom_nav2 -> {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.bottom_nav_fade_in, R.anim.bottom_nav_fade_out)
                    .replace(R.id.framelayout_bottom_navigation_view_container, frag2)
                    .commit()
                return true
            }
            R.id.bottom_nav3 -> {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.bottom_nav_fade_in, R.anim.bottom_nav_fade_out)
                    .replace(R.id.framelayout_bottom_navigation_view_container, frag3)
                    .commit()
                return true
            }
        }

        return true
    }
}