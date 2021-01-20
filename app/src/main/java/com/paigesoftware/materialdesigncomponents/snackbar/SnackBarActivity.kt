package com.paigesoftware.materialdesigncomponents.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_snack_bar.*

class SnackBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)

        button_snackbar.setOnClickListener { view ->
//            plainSnackbar(view)
//            actionSnackbar(view)
//            customDurationSnackbar(view)
//            anchorSnackbar(view)
//            coordinatorLayoutSnackbar() //this doesn't need `view` as an argument. Instead, it just needs `Coordinator Layout` which is defined in layout.xml
            animationSnackbar(view)
        }



    }

    private fun plainSnackbar(view: View) {
        val snackbar = Snackbar.make(view, "You just clicked the snackbar button", Snackbar.LENGTH_LONG)
        snackbar.show()
    }

    private fun actionSnackbar(view: View) {
        val snackbar = Snackbar.make(view, "You just clicked the snackbar button", Snackbar.LENGTH_LONG)
        snackbar.setAction("OK", View.OnClickListener {
            //Do Something
        })
        snackbar.show()
    }

    private fun customDurationSnackbar(view: View) {
        val snackbar = Snackbar.make(view, "You just clicked the snackbar button", Snackbar.LENGTH_LONG)
        snackbar.duration = 5000
        snackbar.setAction("OK", View.OnClickListener {
            //Do Something
        })
        snackbar.show()
    }

    //Snackbar won't hide floatingActionButton, when you set Anchor
    //floatingButton 위에 snackbar가 표시된다.
    private fun anchorSnackbar(view: View) {
        val snackbar = Snackbar.make(view, "You just clicked the snackbar button", Snackbar.LENGTH_LONG)
        snackbar.duration = 5000
        snackbar.setAnchorView(floating_button_snackbar)
        snackbar.setAction("OK", View.OnClickListener {
            //Do Something
        })
        snackbar.show()
    }

    //Provide Coordinator Layout
    //view의 기준을 coordinator layout으로 잡는다.
    //coordinator layout 를 추가만해도 snackbar를 오른쪽으로 swiping했을 때 dismiss하게 한다.
    //Enables swipe to right
    //floating action button의 bottom anchor를 coordinatorLayout top 또는 bottom에 붙였을 때 snackbar가 화면에 나타나면 플로팅 버튼을 위로 올라가게 만든다.
    private fun coordinatorLayoutSnackbar() {
        val snackbar = Snackbar.make(coordinatorlayout_snackbar, "You just clicked the snackbar button", Snackbar.LENGTH_LONG)
        snackbar.duration = 5000
        snackbar.setAction("OK", View.OnClickListener {
            //Do Something
        })
        snackbar.show()
    }

    //SnackBarAnimationMode
    private fun animationSnackbar(view: View) {
        val snackbar = Snackbar.make(view, "You just clicked the snackbar button", Snackbar.LENGTH_LONG)
        snackbar.duration = 5000
        snackbar.anchorView = view
        snackbar.animationMode = BaseTransientBottomBar.ANIMATION_MODE_SLIDE
        snackbar.setAction("OK", View.OnClickListener {
            //Do Something
        })
        snackbar.show()
    }


}

