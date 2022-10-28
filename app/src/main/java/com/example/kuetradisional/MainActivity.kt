package com.example.kuetradisional

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    companion object{
        const val EXTRA_KUE_DATA = "extra_kue_data"
    }

    private lateinit var rvKue: RecyclerView
    private var list: ArrayList<MacamKue> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKue = findViewById(R.id.rv_kue)

        list.addAll(KueData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvKue.layoutManager = LinearLayoutManager(this)
        val cardviewKueAdapter = CardviewKueAdapter(list)
        rvKue.adapter = cardviewKueAdapter
        rvKue.setHasFixedSize(true)

        cardviewKueAdapter.setOnItemClickCallback(object :
            CardviewKueAdapter.OnItemClickCallback {
            override fun onItemClicked(data: MacamKue) {
                val intentdetail = Intent(this@MainActivity, DetailActivity::class.java)
                val kueDataParcelable =
                    kueDataParcelable(data.photo, data.name, data.detail)
                intentdetail.putExtra(EXTRA_KUE_DATA, kueDataParcelable)
                startActivity(intentdetail)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        moveAbout(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun moveAbout(id: Int) {
        if (id == R.id.about_menu) {
            val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(aboutIntent)
        }
    }
}