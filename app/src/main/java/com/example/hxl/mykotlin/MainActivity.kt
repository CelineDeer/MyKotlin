package com.example.hxl.mykotlin

import android.app.Activity
import android.os.Bundle
import android.widget.ListView
import java.util.*


/**
 * Created by hxl on 2017/11/22.
 */
class MainActivity : Activity() {

    var dataList : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView : ListView = findViewById(R.id.listView)

        for (i in 0..20){
            dataList?.add("women"+i)
        }

        var mAdapter = MyAdapter(dataList,this)
        listView.adapter = mAdapter

        mAdapter.notifyDataSetChanged()

    }
}


