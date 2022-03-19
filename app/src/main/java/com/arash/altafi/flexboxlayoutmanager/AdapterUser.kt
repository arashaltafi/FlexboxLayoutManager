package com.arash.altafi.flexboxlayoutmanager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class AdapterUser(private val list: ArrayList<User>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_user , parent , false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val userList = list[position]
        holder.txtName.text = userList.name
        Glide.with(holder.itemView.context).load(userList.image).into(holder.imgAvatar)

    }

    override fun getItemCount(): Int = list.size

}

class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    var imgAvatar: CircleImageView = itemView.findViewById(R.id.user_avatar)
    var txtName: TextView = itemView.findViewById(R.id.user_name)

}