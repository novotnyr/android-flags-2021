package com.github.novotnyr.flags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FlagDetailActivity : AppCompatActivity() {
    private lateinit var flagImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag_detail)

        flagImageView = findViewById(R.id.flagImageView)
    }
}