package com.decagon.decagonclassroom.views.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.decagon.decagonclassroom.R
import com.decagon.decagonclassroom.models.CustomSpinnerItem


class CustomSpinnerAdapter(
    ctx: Context,
    customList: ArrayList<CustomSpinnerItem>
) :
    ArrayAdapter<CustomSpinnerItem>(ctx, 0, customList) {
    override fun getView(
        position: Int, convertView: View?,
        parent: ViewGroup
    ): View {
        var convertView = convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                .inflate(R.layout.custom_spinner_layout, parent, false)
        }
        val item: CustomSpinnerItem? = getItem(position)
        val spinnerIV: ImageView = convertView!!.findViewById(R.id.ivSpinnerLayout)
        val spinnerTV = convertView.findViewById<TextView>(R.id.tvSpinnerLayout)
        if (item != null) {
            spinnerIV.setImageResource(item.spinnerItemImage)
            spinnerTV.text = item.spinnerItemName
        }
        return convertView
    }

    override fun getDropDownView(
        position: Int, convertView: View?,
        parent: ViewGroup
    ): View? {
        var convertView = convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                .inflate(R.layout.custom_spinner_dropdown, parent, false)
        }
        val item: CustomSpinnerItem? = getItem(position)
        val dropDownIV: ImageView = convertView!!.findViewById(R.id.ivDropDownLayout)
        val dropDownTV = convertView.findViewById<TextView>(R.id.tvDropDownLayout)
        if (item != null) {
            dropDownIV.setImageResource(item.spinnerItemImage)
            dropDownTV.text = item.spinnerItemName
        }
        return convertView
    }
}