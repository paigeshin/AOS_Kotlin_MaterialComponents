package com.paigesoftware.materialdesigncomponents.topappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_top_app_bar.*

class TopAppBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_app_bar)

        setSupportActionBar(top_app_bar_main_tool_bar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_app_barmain_menu, menu)
        return true
    }

}