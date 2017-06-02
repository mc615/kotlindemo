package com.mpc.myapplication.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mpc.myapplication.R
import com.mpc.myapplication.bean.ListBean

/**
 * @author :毛朋冲
 * *
 * @description :
 * *
 * @date :2017/5/27 10:37
 */

class ListAdapter(val context:Context,val list:List<ListBean>): RecyclerView.Adapter<ListAdapter.listViewHolder>() {
    override fun onBindViewHolder(holder: listViewHolder?, position: Int) {
        val listBean = list[position]
        holder!!.textview!!.text = listBean.name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listViewHolder? {
        var view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)

        return listViewHolder(view)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class listViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textview: TextView? = null
        init{
            textview = itemView.findViewById(R.id.tv_item) as TextView?
        }
    }
}
