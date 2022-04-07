package com.reyy.recyclerviewkotlinreyy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBadmintonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_badminton)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val badminton = intent.getParcelableExtra<Badminton>(MainActivity.INTENT_PARCELABLE)
        val imgbadminton = findViewById<ImageView>(R.id.img_item_photo)
        val nameBadminton = findViewById<TextView>(R.id.tv_item_name)
        val descBadminton = findViewById<TextView>(R.id.tv_item_description)

        imgbadminton.setImageResource(badminton?.imgBadminton!!)
        nameBadminton.text = badminton.nameBadminton
        descBadminton.text = badminton.descBadminton
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}