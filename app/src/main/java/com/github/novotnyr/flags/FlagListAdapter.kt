package com.github.novotnyr.flags

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FlagListAdapter : RecyclerView.Adapter<FlagViewHolder>() {
    val flags = listOf(
        Flag("Austria", R.drawable.austria),
        Flag("Croatia", R.drawable.croatia),
        Flag("Czech Republic", R.drawable.czech),
        Flag("Germany", R.drawable.germany),
        Flag("Hungary", R.drawable.hungary),
        Flag("Poland", R.drawable.poland),
        Flag("Romania", R.drawable.romania),
        Flag("Serbia", R.drawable.serbia),
        Flag("Slovakia", R.drawable.slovakia),
        Flag("Slovenia", R.drawable.slovenia),
        Flag("Ukraine", R.drawable.ukraine),
    )

    private var flagClickListener = FlagClickListener {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlagViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.activity_list_item, parent, false)

        return FlagViewHolder(layout)
    }

    override fun onBindViewHolder(holder: FlagViewHolder, position: Int) {
        holder.bind(flags[position], flagClickListener)
    }

    override fun getItemCount(): Int {
        return flags.size
    }

    fun onFlagClick(listener: FlagClickListener) {
        flagClickListener = listener;
    }
}