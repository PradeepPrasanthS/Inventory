package com.pradeep.inventory.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.pradeep.inventory.R

class LoginActivity : Activity() {

    private lateinit var emailEdit: EditText
    private lateinit var passwordEdit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailEdit = findViewById(R.id.email)
        passwordEdit = findViewById(R.id.password)
    }

    fun login(view: View) {
        val email = emailEdit.text.toString()
        val password = passwordEdit.text.toString()

        if(email == "test@test.com" && password == "Test@123") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Invalid login credentials", Toast.LENGTH_SHORT).show()
        }
    }
}