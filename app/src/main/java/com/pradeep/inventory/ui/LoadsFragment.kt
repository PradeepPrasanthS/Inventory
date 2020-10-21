package com.pradeep.inventory.ui

import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pradeep.inventory.R
import com.pradeep.inventory.adapter.LoadsAdapter


class LoadsFragment : Fragment() {

    private lateinit var adapter: LoadsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_loads, container, false)

        setHasOptionsMenu(true)
        root.findViewById<FloatingActionButton>(R.id.fab).setColorFilter(Color.WHITE)

        val loadsList = root.findViewById<RecyclerView>(R.id.loadsList)

        val layoutManager = LinearLayoutManager(activity)
        loadsList.layoutManager = layoutManager

        adapter = LoadsAdapter()
        loadsList.adapter = adapter

        return root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.loads_menu, menu)
    }
}