package com.paigesoftware.materialdesigncomponents.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*

/* Remember that you can just put dialog but alertdialog is highly customizable */
class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        button_showdialog.setOnClickListener {
//            simpleAlertDialog()
//            optionsAlertDialog()
            multipleChoicesAlertDialog()
        }

    }

    private fun simpleAlertDialog() {
        val builder = MaterialAlertDialogBuilder(this)
        builder
            .setTitle("Alert Dialog")
            .setMessage("This is a simple Alert Dialog")
            .setIcon(R.drawable.ic_baseline_access_alarm_24)
            .setBackground(ContextCompat.getDrawable(this, R.drawable.alert_dialog_bg))
        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->

        })
        builder.setNegativeButton("DISMISS", DialogInterface.OnClickListener { dialog, which ->

        })
        builder.show()
    }

    private fun optionsAlertDialog() {
        val builder = MaterialAlertDialogBuilder(this)
        val alertItems = arrayOf("Movies", "Photos", "Music")
        builder
            .setTitle("View Options")
            .setBackground(ContextCompat.getDrawable(this, R.drawable.alert_dialog_bg))
            .setSingleChoiceItems(alertItems, 0, DialogInterface.OnClickListener { dialog, which ->
                when(which) {
                    0 -> {

                    }
                    1 -> {

                    }
                }
                Snackbar.make(button_showdialog, "You have selected : $which", Snackbar.LENGTH_LONG).show()
                dialog.dismiss()
            })
        builder.show()
    }

    private fun multipleChoicesAlertDialog() {
        val builder = MaterialAlertDialogBuilder(this)
        val alertItems = arrayOf("Movies", "Photos", "Music")
        val selectedItems = booleanArrayOf(false, true, true)
        builder
            .setTitle("View Options")
            .setBackground(ContextCompat.getDrawable(this, R.drawable.alert_dialog_bg))
            .setMultiChoiceItems(alertItems, selectedItems, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->

            })
        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->

        })
        builder.setNegativeButton("DISMISS", DialogInterface.OnClickListener { dialog, which ->

        })
        builder.show()
    }



}