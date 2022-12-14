package com.example.kuetradisional

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class DetailActivity : AppCompatActivity() {

    private lateinit var imgItemPhoto: ImageView
    private lateinit var tvItemName: TextView
    private lateinit var tvItemDetail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        title = "Detail"

        val sotoData: kueDataParcelable? = intent.getParcelableExtra(MainActivity.EXTRA_KUE_DATA)

        imgItemPhoto = findViewById(R.id.img_item_photo)
        tvItemName = findViewById(R.id.tv_item_name)
        tvItemDetail = findViewById(R.id.tv_item_detail)

        Glide.with(this)
            .load(sotoData!!.photo)
            .apply(RequestOptions.overrideOf(300))
            .into(imgItemPhoto)

        tvItemName.text = sotoData.name
        tvItemDetail.text = sotoData.detail


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_share, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent (Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_SUBJECT, "Share")
        startActivity(Intent.createChooser(intent, "Share Via"))
        return super.onOptionsItemSelected(item)
    }



}