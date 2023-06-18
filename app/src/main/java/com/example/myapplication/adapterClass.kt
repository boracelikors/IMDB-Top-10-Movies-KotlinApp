package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var sira = arrayOf("1.", "2.", "3."," 4.", "5.", "6.", "7.", "8.", "9.", "10.")

    private var filmler = arrayOf(
        "Esaretin Bedeli",
        "Kara Şövalye",
        "Baba",
        "Baba 2",
        "Dövüş Kulübü",
        "Yüzüklerin Efendisi: Kralın Dönüşü",
        "Ucuz Roman",
        "İyi, Kötü ve Çirkin",
        "12 Öfkeli Adam",
        "Yüzüklerin Efendisi: Yüzük Kardeşliği"
    )

    private var yonetmenler = arrayOf(
        "Frank Darabont",
        "Christopher Nolan",
        "Francis Ford Capolla",
        "Francis Ford Capolla",
        "David Fincher",
        "Peter Jackson",
        "Qentin Tarantino",
        "Sergio Leone",
        "Sidney Lumet",
        "Peter Jackson"
    )

    private var yillar = arrayOf(
        "1997",
        "2005",
        "1972",
        "1974",
        "1999",
        "2003",
        "1999",
        "1966",
        "1957",
        "2001"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.kartlar, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {

        holder.sayi.text = sira[position]
        holder.sayi1.text = filmler[position]
        holder.sayi2.text = yonetmenler[position]
        holder.sayi3.text = yillar[position]

    }

    override fun getItemCount(): Int {
        return sira.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val sayi: TextView = itemView.findViewById(R.id.textView)
        val sayi1: TextView = itemView.findViewById(R.id.textView3)
        val sayi2: TextView = itemView.findViewById(R.id.textView4)
        val sayi3: TextView = itemView.findViewById(R.id.textView5)

    }
}