package com.example.angel.modernandroidapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.angel.modernandroidapp.databinding.RvItemRepositoryBinding

class RepositoryRecyclerViewAdapter(private var items: ArrayList<Repository>,
                                    private var listener: AdapterView.OnItemClickListener)
                                    : RecyclerView.Adapter<RepositoryRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemRepositoryBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(items[position], listener)
    }

    class ViewHolder(private var binding: RvItemRepositoryBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(repo: Repository, listener: AdapterView.OnItemClickListener?) {
            binding.repository = repo

            binding.executePendingBindings()
        }
    }
}