package com.example.dssadmin.utils

import android.view.View

object Listeners {

    fun View.commonClickListeners(action:(View) -> Unit ){
        this.setOnClickListener { v-> action(v) }

    }


}