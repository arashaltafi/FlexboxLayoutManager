package com.arash.altafi.flexboxlayoutmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.AlignItems
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var recyUser : RecyclerView
    private lateinit var btnShow : MaterialButton
    private lateinit var btnClick : MaterialButton
    private lateinit var adapter : AdapterUser
    private var list : ArrayList<User> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        findViews()
        addUser()
        adapter = AdapterUser(list)
        recyUser.adapter = adapter
        recyUser.layoutManager = FlexboxLayoutManager(this).apply {
            flexDirection = FlexDirection.ROW
            justifyContent = JustifyContent.SPACE_AROUND
            alignItems = AlignItems.STRETCH
        }
    }

    private fun addUser() {
        list.add(User(1 , "آرش الطافی 1",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 2",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 3",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 4",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 5",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 5",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 5",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 5",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 5",R.drawable.arash))
        list.add(User(1 , "آرش الطافی 5",R.drawable.arash))
    }

    private fun findViews() {
        recyUser = findViewById(R.id.rc_user)
    }

}