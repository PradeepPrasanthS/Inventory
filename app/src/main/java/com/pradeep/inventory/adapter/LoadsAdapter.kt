package com.pradeep.inventory.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.pradeep.inventory.R

class LoadsAdapter: RecyclerView.Adapter<LoadsAdapter.LoadsListHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LoadsListHolder {
        val inflatedView = parent.inflate(R.layout.loads_layout, false)
        return LoadsListHolder(inflatedView)
    }

    override fun onBindViewHolder(
        holder: LoadsListHolder,
        position: Int
    ) {

    }

    private fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

    override fun getItemCount(): Int {
        return 6
    }

    class LoadsListHolder(v: View) : RecyclerView.ViewHolder(v) {

    }
}