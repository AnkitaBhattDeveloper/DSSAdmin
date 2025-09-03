package com.example.dssadmin.utils

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.dssadmin.MainActivity

object AuthenticationHelper {

    fun adminLogin(context: Context, admin_id:String, admin_password:String){
        if (admin_id.isNullOrEmpty() && admin_password.isNullOrEmpty()){
            Toast.makeText(context, "Credentials can't be empty", Toast.LENGTH_SHORT).show()
            return
        }
        else{
            Log.e("TAG", "adminLogin: --- else " )

            targetClass(context = context, MainActivity::class.java)

        }

    }



}