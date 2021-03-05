package com.github.novotnyr.flags

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

        flagListAdapter.onFlagClick { flag ->
            val showFlagIntent = Intent(this, FlagDetailActivity::class.java)
            showFlagIntent.putExtra("flag", flag)
            startActivity(showFlagIntent)
        }
    }
}