package com.example.recycleviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleViewAdapter : RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>() {
    var contlay: RelativeLayout? = null
    var imgList = ArrayList<String>()
    var imgName = ArrayList<String>()

    constructor(
        contlay: RelativeLayout?,
        imgList: ArrayList<String>,
        imgName: ArrayList<String>
    ) : super() {
        this.contlay = contlay
        this.imgList = imgList
        this.imgName = imgName
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val myView = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
        return MyViewHolder(myView)


    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgOne = itemView.findViewById(R.id.imgV) as ImageView
        val imgText = itemView.findViewById(R.id.imgT) as TextView
        val contextLay = itemView.findViewById(R.id.contLayout) as RelativeLayout
    }
}