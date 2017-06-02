package com.mpc.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.mpc.myapplication.adapter.ListAdapter

import com.mpc.myapplication.bean.ListBean

class ListActivity : AppCompatActivity() {

    var listBean: MutableList<ListBean> = ArrayList()
    var recyclerview: RecyclerView? = null
    var mAdapter: ListAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        initview()
        initData()
    }

    fun initview() {
        recyclerview = findViewById(R.id.rv_List) as RecyclerView?

        recyclerview!!.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        mAdapter = ListAdapter(this, listBean)

    }
//添加数据
    fun initData() {
        for (i in 0..5) {
            var item: ListBean = ListBean()
            item!!.name = ""+i
        listBean.add(item)

        }

        recyclerview!!.adapter = mAdapter
    }

}


