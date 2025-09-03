package com.example.dssadmin.utils

import android.content.Context
import android.content.Intent

fun targetClass(context: Context,targetClass:Class<*>){
    context.startActivity(Intent(context,targetClass))

}