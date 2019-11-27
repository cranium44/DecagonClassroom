package com.decagon.decagonclassroom


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.decagon.decagonclassroom.models.CustomSpinnerItem
import com.decagon.decagonclassroom.views.adapters.CustomSpinnerAdapter


class VerificationActivity : AppCompatActivity() {

    var customSpinner: Spinner? = null
    var customList: ArrayList<CustomSpinnerItem>? = null
    var width = 150

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        customSpinner = findViewById(R.id.stack_dropdown)
        customList = getdata()
        val adapter = CustomSpinnerAdapter(this, customList!!)
        if (customSpinner != null) {
            customSpinner!!.adapter = adapter

        }

        var button: Button = findViewById(R.id.submit_ver_btn)

        button.setOnClickListener {
            it.context.startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun getdata(): ArrayList<CustomSpinnerItem> {
        customList = ArrayList()
        customList!!.add(CustomSpinnerItem("Android", R.drawable.ic_kotlin_ic))
        customList!!.add(CustomSpinnerItem("Java", R.drawable.java_ic))
        customList!!.add(CustomSpinnerItem("Python", R.drawable.python_ic))
        customList!!.add(CustomSpinnerItem("Node", R.drawable.node_ic))
        customList!!.add(CustomSpinnerItem("C#", R.drawable.c_sharp_ic))
        return customList!!
    }
}
