package com.paigesoftware.materialdesigncomponents.textfield

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_text_field.*

class TextFieldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_field)

        title = "TextFieldActivity"
        val items = arrayOf("Item 1", "Item 2", "Item 3", "Others")
        val adapter = ArrayAdapter<String>(this, R.layout.textfield_dropdown_item, items)
        textview_autocomplete_dropdown.setAdapter(adapter)
    }
}