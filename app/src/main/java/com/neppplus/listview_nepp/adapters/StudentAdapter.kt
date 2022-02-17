package com.neppplus.listview_nepp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listview_nepp.R
import com.neppplus.listview_nepp.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val txtStudentName = row.findViewById<TextView>(R.id.txtStudentName)
        val txtStudentAge = row.findViewById<TextView>(R.id.txtStudentAge)
        val txtStudentAdress = row.findViewById<TextView>(R.id.txtStudentAdress)

        txtStudentName.text = data.name
        txtStudentAdress.text = data.address


        txtStudentAge.text = "(${data.getKoreanAge(2022)}세)"

        return row
    }
}