package com.neppplus.listview_nepp.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listview_nepp.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {
}