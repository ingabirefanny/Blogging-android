package com.example.myblogs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BloggerAdapter (var blogList: List<Blog>): RecyclerView.Adapter<BlogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.blog_list,parent,false)
        return BlogViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        var author=blogList[position]
        holder.tvAuthorName.text=author.name
        holder.tvTitle.text=author.title
        holder.tvYear.text=author.published
        holder.tvRead.text=author.read
        holder.tvPreview.text=author.preview

    }

    override fun getItemCount(): Int {
        return  blogList.size
    }
}

class BlogViewHolder( itemView: View): RecyclerView.ViewHolder(itemView){
    var tvAuthorName= itemView.findViewById<TextView>(R.id.tvAuthorName)
    var tvTitle=itemView.findViewById<TextView>(R.id.tvTitle)
    var tvYear=itemView.findViewById<TextView>(R.id.tvYear)
    var tvRead=itemView.findViewById<TextView>(R.id.tvRead)
    var tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
}