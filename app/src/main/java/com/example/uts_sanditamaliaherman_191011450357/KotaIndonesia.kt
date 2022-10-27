package com.example.uts_sanditamaliaherman_191011450357

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class KotaIndonesia (var mContext: Context, var resources: Int, var items:List<Kota>): ArrayAdapter<Kota>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mContext)
        val view: View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.photo)
        val KotaIndonesia: TextView = view.findViewById(R.id.tvKota)
        val Deskripsi: TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:Kota = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        KotaIndonesia.text = mItem.kota
        Deskripsi.text = mItem.deskripsi
        return view
    }
}