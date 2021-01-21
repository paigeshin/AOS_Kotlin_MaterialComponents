package com.paigesoftware.materialdesigncomponents.taplayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_tab_layout.*

class TabLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        setSupportActionBar(toolbar_taplayout)

        tablayout.setupWithViewPager(viewpager_tablayout)
        val viewPagerAdapter = MyFragmentViewPagerAdapter(supportFragmentManager)

        val frag1 = TabFrag1()
        val frag2 = TabFrag2()
        val frag3 = TabFrag3()
        viewPagerAdapter.addFragment(frag1, "Fragment1")
        viewPagerAdapter.addFragment(frag2, "Fragment2")
        viewPagerAdapter.addFragment(frag3, "Fragment3")
        viewpager_tablayout.adapter = viewPagerAdapter

        //set icon
        tablayout.getTabAt(0)?.setIcon(R.drawable.ic_baseline_access_alarm_24)
        tablayout.getTabAt(1)?.setIcon(R.drawable.ic_baseline_airplay_24)
        tablayout.getTabAt(2)?.setIcon(R.drawable.ic_baseline_add_circle_24)

        //badge
        val badgeDrawable = tablayout.getTabAt(0)?.orCreateBadge
        badgeDrawable?.isVisible = true
        badgeDrawable?.number = 12

    }

}