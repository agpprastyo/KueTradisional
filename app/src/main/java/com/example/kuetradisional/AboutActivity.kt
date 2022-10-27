package com.example.kuetradisional

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

class AboutActivity: androidx.appcompat.app.AppCompatActivity(), View.OnClickListener {

    private lateinit var btnemail: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btnemail = findViewById(R.id.btn_email)

        btnemail.setOnClickListener(this)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_email -> {
                val sendMailIntent = Intent(
                    Intent.ACTION_SENDTO,
                    Uri.parse("mailto:${resources.getString(R.string.name_email)}")
                )
                startActivity(sendMailIntent)
            }


        }
    }

    // this event will enable the back
    // function to the button on press


    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}