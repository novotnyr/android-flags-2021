package com.github.novotnyr.flags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FlagListActivity : AppCompatActivity() {
    lateinit var flagsRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag_list)

        flagsRecyclerView = findViewById(R.id.flagsRecyclerView)
        flagsRecyclerView.layoutManager = LinearLayoutManager(this)

        val flagListAdapter = FlagListAdapter()
        flagsRecyclerView.adapter = flagListAdapter
    }
}