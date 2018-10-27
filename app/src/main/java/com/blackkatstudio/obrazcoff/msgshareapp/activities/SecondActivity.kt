package com.blackkatstudio.obrazcoff.msgshareapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.blackkatstudio.obrazcoff.msgshareapp.R
import com.blackkatstudio.obrazcoff.msgshareapp.showToast
import kotlinx.android.synthetic.main.acivity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acivity_second)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")

        showToast(msg)

        txtUserMessage.text = msg
    }
}