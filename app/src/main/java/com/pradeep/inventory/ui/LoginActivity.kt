package com.pradeep.inventory.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pradeep.inventory.R

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun login(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}