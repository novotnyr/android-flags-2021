package com.github.novotnyr.flags

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlagViewHolder(layout: View) : RecyclerView.ViewHolder(layout) {
    val textView: TextView = layout.findViewById(android.R.id.text1)

    fun bind(flag: Flag, flagClickListener: FlagClickListener) {
        textView.text = flag.country
        textView.setOnClickListener {
            flagClickListener.onFlagClick(flag)
        }
    }
}