package com.paigesoftware.materialdesigncomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.paigesoftware.materialdesigncomponents.alertdialog.AlertDialogActivity
import com.paigesoftware.materialdesigncomponents.bottomappbar.BottomAppBarActivity
import com.paigesoftware.materialdesigncomponents.bottomnavigationview.BottomNavigationViewActivity
import com.paigesoftware.materialdesigncomponents.bottomsheet.BottomSheetActivity
import com.paigesoftware.materialdesigncomponents.datepicker.DatePickerActivity
import com.paigesoftware.materialdesigncomponents.floatingbutton.FloatingButtonActivity
import com.paigesoftware.materialdesigncomponents.navigationdrawer.NavigationDrawerActivity
import com.paigesoftware.materialdesigncomponents.snackbar.SnackBarActivity
import com.paigesoftware.materialdesigncomponents.textfield.TextFieldActivity
import com.paigesoftware.materialdesigncomponents.topappbar.TopAppBarActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_go_to_bottom_navigation_view.setOnClickListener(this)
        button_go_to_snackbar.setOnClickListener(this)
        button_go_to_alertdialog.setOnClickListener(this)
        button_go_to_floatingbutton.setOnClickListener(this)
        button_go_to_bottom_appbar.setOnClickListener(this)
        button_go_to_bottom_sheet.setOnClickListener(this)
        button_go_to_datepicker.setOnClickListener(this)
        button_go_to_top_app_bar.setOnClickListener(this)
        button_go_to_textfield.setOnClickListener(this)
        button_go_to_navigation_drawer.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.button_go_to_bottom_navigation_view -> {
                startActivity(Intent(this, BottomNavigationViewActivity::class.java))
            }
            R.id.button_go_to_snackbar -> {
                startActivity(Intent(this, SnackBarActivity::class.java))
            }
            R.id.button_go_to_alertdialog -> {
                startActivity(Intent(this, AlertDialogActivity::class.java))
            }
            R.id.button_go_to_floatingbutton -> {
                startActivity(Intent(this, FloatingButtonActivity::class.java))
            }
            R.id.button_go_to_bottom_appbar -> {
                startActivity(Intent(this, BottomAppBarActivity::class.java))
            }
            R.id.button_go_to_bottom_sheet -> {
                startActivity(Intent(this, BottomSheetActivity::class.java))
            }
            R.id.button_go_to_datepicker-> {
                startActivity(Intent(this, DatePickerActivity::class.java))
            }
            R.id.button_go_to_top_app_bar -> {
                startActivity(Intent(this, TopAppBarActivity::class.java))
            }
            R.id.button_go_to_textfield -> {
                startActivity(Intent(this, TextFieldActivity::class.java))
            }
            R.id.button_go_to_navigation_drawer -> {
                startActivity(Intent(this, NavigationDrawerActivity::class.java))
            }
        }
    }

}