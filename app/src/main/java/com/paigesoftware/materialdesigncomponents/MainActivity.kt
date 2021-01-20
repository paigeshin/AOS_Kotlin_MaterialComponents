package com.paigesoftware.materialdesigncomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.paigesoftware.materialdesigncomponents.bottomnavigationview.BottomNavigationViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_bottom_navigation_view.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.button_bottom_navigation_view -> {
                startActivity(Intent(this, BottomNavigationViewActivity::class.java))
            }
        }
    }

}