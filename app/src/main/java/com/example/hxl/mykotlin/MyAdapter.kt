package com.example.hxl.mykotlin

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import java.util.*

/**
 * Created by hxl on 2017/11/21.
 */
class MyAdapter(var mlist : ArrayList<String>, var context : Context) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var holder : MyViewHolder
        var v : View
        if (convertView == null){
            holder = MyViewHolder()
            v = LayoutInflater.from(context).inflate(R.layout.list_details,parent,false)
            holder.textView = v.findViewById(R.id.news_title)
            v.tag = holder
        }else{
            v = convertView!!
            holder = v.getTag() as MyViewHolder
        }

        /**
         * listView的item点击事件
         */
        v.setOnClickListener {
            Log.e("hxl","click:"+position)
        }

        holder.textView.text = mlist.get(position)

        return v!!
    }

    override fun getItem(position: Int): Any {
        return mlist[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mlist.size
    }

    class MyViewHolder{
        lateinit var textView : TextView
    }
}