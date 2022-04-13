package com.example.mad_ind05_philip_lijo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class StateAdapter (private val stateList : ArrayList<States>) : RecyclerView.Adapter<StateAdapter.MyViewHolder>() {

    // Portion of the code was referenced and modified from https://stackoverflow.com/questions/18405299/onitemclicklistener-using-arrayadapter-for-listview on (4/10/22)
    private lateinit var slistiner : OnStateClickListener

    interface OnStateClickListener {
        fun onStateClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnStateClickListener) {

        slistiner = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.state_list, parent, false)
        return MyViewHolder(itemView, slistiner)
    }

    // Calls RecyclerView to display the state image, name, and nickname at a specified position
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = stateList[position]
        holder.flagImage.setImageResource(currentItem.flagImage)
        holder.stateName.text = currentItem.name
        holder.stateNickname.text = currentItem.nickname
    }

    // Tells adapter how many states in the recycleView
    override fun getItemCount(): Int {

        return stateList.size
    }

    // Refers to the imageView and Textview in Main Activity
    class MyViewHolder(itemView: View, listener: OnStateClickListener) : RecyclerView.ViewHolder(itemView) {

        val flagImage : ShapeableImageView = itemView.findViewById(R.id.flagImage)
        val stateName : TextView = itemView.findViewById(R.id.stateName)
        val stateNickname : TextView = itemView.findViewById(R.id.stateNickname)

        init {
            itemView.setOnClickListener {

                listener.onStateClick(adapterPosition)
            }
        }

    }
}