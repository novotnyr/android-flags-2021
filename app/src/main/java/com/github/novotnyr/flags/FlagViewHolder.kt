package com.github.novotnyr.flags

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlagViewHolder(layout: View) : RecyclerView.ViewHolder(layout) {
    val icon: ImageView = layout.findViewById(android.R.id.icon)
    val textView: TextView = layout.findViewById(android.R.id.text1)

    fun bind(flag: Flag, flagClickListener: FlagClickListener) {
        icon.setImageResource(flag.flagResource)
        textView.text = flag.country
        textView.setOnClickListener {
            flagClickListener.onFlagClick(flag)
        }
    }
}