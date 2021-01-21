package com.paigesoftware.materialdesigncomponents.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.paigesoftware.materialdesigncomponents.R
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.*

class DatePickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        button_show_date_picker.setOnClickListener {
//            showPlainDatePicker()
//            showRangeDatePicker()
//            showYearConstrainedDatePicker()
            showDefaultMonthConstrainedDatePicker()
        }

    }

    private fun showPlainDatePicker() {
        val builder = MaterialDatePicker.Builder.datePicker()
        builder.setTitleText("SELECT A DATE")
        val materialDatePicker = builder.build()
        materialDatePicker.show(supportFragmentManager, "DATE_PICKER")
        materialDatePicker.addOnPositiveButtonClickListener {
            textview_display_date_picker_result.text = "Selected Date: ${materialDatePicker.headerText} - $it"
        }
    }

    // Additional Features
    private fun showDefaultMonthConstrainedDatePicker() {
        // select current date - additional feature
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.clear()
        val today = MaterialDatePicker.todayInUtcMilliseconds()

        // Calendar Constraint - additional feature
        calendar.timeInMillis = today

        calendar.set(Calendar.MONTH, Calendar.JANUARY)
        val january = calendar.timeInMillis

        calendar.set(Calendar.MONTH, Calendar.FEBRUARY)
        val february = calendar.timeInMillis

        calendar.set(Calendar.MONTH, Calendar.MARCH)
        val march = calendar.timeInMillis

        calendar.set(Calendar.MONTH, Calendar.DECEMBER)
        val december = calendar.timeInMillis

        val constraintBuilder = CalendarConstraints.Builder()
        //2월 기준으로 열어줌
        //constraintBuilder.setOpenAt(february)

        //현재 날짜에서 뒤에 날짜는 disable하고 앞에 날짜만 enable
        //constraintBuilder.setValidator(DateValidatorPointForward.now())

        //3월부터 시작
        constraintBuilder.setValidator(DateValidatorPointForward.from(march))

        val builder = MaterialDatePicker.Builder.datePicker()
        builder.setTitleText("SELECT A DATE")
        builder.setSelection(today) // select current date - additional feature
        builder.setCalendarConstraints(constraintBuilder.build()) // Calendar Constraint - additional feature
        val materialDatePicker = builder.build()
        materialDatePicker.show(supportFragmentManager, "DATE_PICKER")
        materialDatePicker.addOnPositiveButtonClickListener {
            textview_display_date_picker_result.text = "Selected Date: ${materialDatePicker.headerText} - $it"
        }
    }

    //Not Seems to work
    private fun showYearConstrainedDatePicker() {
        // select current date - additional feature
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.clear()
        val today = MaterialDatePicker.todayInUtcMilliseconds()

        // Calendar Constraint - additional feature
        calendar.timeInMillis = today

        calendar.set(Calendar.MONTH, Calendar.JANUARY)
        val january = calendar.timeInMillis

        calendar.set(Calendar.MONTH, Calendar.DECEMBER)
        val december = calendar.timeInMillis

        val constraintBuilder = CalendarConstraints.Builder()
        constraintBuilder.setStart(january)
        constraintBuilder.setEnd(december)


        val builder = MaterialDatePicker.Builder.datePicker()
        builder.setTitleText("SELECT A DATE")
        builder.setSelection(today) // select current date - additional feature
        builder.setCalendarConstraints(constraintBuilder.build()) // Calendar Constraint - additional feature
        val materialDatePicker = builder.build()
        materialDatePicker.show(supportFragmentManager, "DATE_PICKER")
        materialDatePicker.addOnPositiveButtonClickListener {
            textview_display_date_picker_result.text = "Selected Date: ${materialDatePicker.headerText} - $it"
        }
    }

    private fun showCurrentDateSelectedDatePicker() {
        // select current date - additional feature
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.clear()
        val today = MaterialDatePicker.todayInUtcMilliseconds()

        val builder = MaterialDatePicker.Builder.datePicker()
        builder.setTitleText("SELECT A DATE")
        builder.setSelection(today) // select current date - additional feature
        val materialDatePicker = builder.build()
        materialDatePicker.show(supportFragmentManager, "DATE_PICKER")
        materialDatePicker.addOnPositiveButtonClickListener {
            textview_display_date_picker_result.text = "Selected Date: ${materialDatePicker.headerText} - $it"
        }
    }

    private fun showRangeDatePicker() {
        //MaterialDatePicker<Pair<Long, Long>>
        val builder = MaterialDatePicker.Builder.dateRangePicker()
        builder.setTitleText("SELECT A DATE")
        val materialDatePicker = builder.build()
        materialDatePicker.show(supportFragmentManager, "RANGE_PICKER")
        materialDatePicker.addOnPositiveButtonClickListener {
            textview_display_date_picker_result.text = "Selected Date: ${materialDatePicker.headerText} - $it"
        }
    }


}