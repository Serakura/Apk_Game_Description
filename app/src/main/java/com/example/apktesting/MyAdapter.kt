package com.example.listview

import android.widget.ArrayAdapter
import android.view.View
import android.view.ViewGroup
import android.app.Activity
import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.example.apktesting.Game
import com.example.apktesting.R

class MyAdapter(private val context : Activity,private val arraylist : ArrayList<Game>)
    : ArrayAdapter<Game>(context, R.layout.list_view,arraylist) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_view,null);

        val gambarGame : ImageView = view.findViewById(R.id.gambarGame)
        val titleKonten : TextView = view.findViewById(R.id.titleKonten)
        val jenisGame : TextView = view.findViewById(R.id.jenisGame)

        gambarGame.setImageResource(arraylist[position].ImageId)
        titleKonten.text = arraylist[position].name
        jenisGame.text = arraylist[position].jenisGame



        return view
    }

}