package com.example.dssadmin.login

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dssadmin.R
import com.example.dssadmin.databinding.ActivityLoginBinding
import com.example.dssadmin.utils.AuthenticationHelper.adminLogin
import com.example.dssadmin.utils.Listeners.commonClickListeners

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var admin_id: AppCompatEditText
    private lateinit var admin_password: AppCompatEditText
    private lateinit var login_btn: AppCompatButton
    private lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        context = this
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setUp()

    }

    private fun setUp() {
        initializeViews()
        initializeListeners()

    }


    private fun initializeViews() {
        binding.apply {
            admin_id = adminId
            admin_password = adminPassword
            login_btn = loginBtn
        }
    }

    private fun initializeListeners() {
       /* val admin = admin_id.getText().toString()
        val password = admin_password.getText().toString()
        Log.e("TAG", "initializeListeners: admin password -- $admin , $password")*/
        login_btn.commonClickListeners {
            val admin = admin_id.getText().toString()
            val password = admin_password.getText().toString()
            Log.e("TAG", "initializeListeners: admin password -- $admin , $password")
            authenticateLogin(admin, password)
        }

    }

    private fun authenticateLogin(admin_id: String, password: String) {
        if (admin_id == "Admin" && password == "Admin123") {
            adminLogin(context, admin_id, password)
        }
        else{
            Toast.makeText(context, "Invalid Id or Password", Toast.LENGTH_SHORT).show()
        }
    }


}