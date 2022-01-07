package com.gmg.android.toastalpha

import android.content.Context
import android.widget.Toast

class GToast(val context: Context) {

    fun toastMessage() {
        Toast.makeText(context, "opp", Toast.LENGTH_LONG).show()
    }
}