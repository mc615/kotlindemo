package com.mpc.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var tv: TextView? = null
    var tv_bt: Button? = null
    var ac_button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
    }

    //初始化控件
    fun initview() {
        tv_bt = findViewById(R.id.text_bt) as Button?
        ac_button = findViewById(R.id.ac_bt) as Button?
        tv = findViewById(R.id.main_tv) as TextView?

        tv_bt!!.setOnClickListener(this)
        ac_button!!.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v) {
            text_bt -> {

                tv!!.text = "hello kotlin"
            }
            ac_bt -> {

                startActivity(Intent(this, ListActivity::class.java))
            }

        }
    }
}
