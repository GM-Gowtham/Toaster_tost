package com.gmg.android.toastmessageare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gmg.android.toastalpha.GToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GToast(context = this).toastMessage()
    }
}