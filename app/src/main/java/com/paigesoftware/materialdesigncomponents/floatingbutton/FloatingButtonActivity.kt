package com.paigesoftware.materialdesigncomponents.floatingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_floating_button.*

class FloatingButtonActivity : AppCompatActivity() {

    private var isOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_button)

        var fabOpenAnim: Animation
        var fabCloseAnim: Animation

        main_add_fab.setOnClickListener {
            fabOpenAnim = AnimationUtils.loadAnimation(this, R.anim.fab_anim_open)
            fabCloseAnim = AnimationUtils.loadAnimation(this, R.anim.fab_anim_close)
            if(!isOpen) {
                fab_add_user.animation = fabOpenAnim
                fab_add_contact.animation = fabOpenAnim
                add_user_textview.visibility = View.VISIBLE
                add_contact_textview.visibility = View.VISIBLE
                isOpen = true
            } else {
                fab_add_user.animation = fabCloseAnim
                fab_add_contact.animation = fabCloseAnim
                add_user_textview.visibility = View.INVISIBLE
                add_contact_textview.visibility = View.INVISIBLE
                isOpen = false
            }

        }

    }

}