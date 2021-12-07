package com.example.mobilefinal00

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MyInfoActivity(context: Context):Dialog(context) {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.myinfo_activity)

            window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }




}