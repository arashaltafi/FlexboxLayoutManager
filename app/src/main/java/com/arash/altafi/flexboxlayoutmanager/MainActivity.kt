package com.arash.altafi.flexboxlayoutmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.flexboxlayoutmanager.databinding.ActivityMainBinding
import com.google.android.flexbox.AlignItems
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AdapterUser
    private var list: ArrayList<User> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() = binding.apply {
        addUser()
        adapter = AdapterUser(list)
        rcUser.adapter = adapter
        rcUser.layoutManager = FlexboxLayoutManager(this@MainActivity).apply {
            flexDirection = FlexDirection.ROW
            justifyContent = JustifyContent.SPACE_AROUND
            alignItems = AlignItems.STRETCH
        }
    }

    private fun addUser() {
        list.add(User(1, "arash 1", R.drawable.arash))
        list.add(User(2, "arash 2", R.drawable.arash))
        list.add(User(3, "arash 3", R.drawable.arash))
        list.add(User(4, "arash 4", R.drawable.arash))
        list.add(User(5, "arash 5", R.drawable.arash))
        list.add(User(6, "arash 6", R.drawable.arash))
        list.add(User(7, "arash 7", R.drawable.arash))
        list.add(User(8, "arash 8", R.drawable.arash))
        list.add(User(9, "arash 9", R.drawable.arash))
        list.add(User(10, "arash 10", R.drawable.arash))
    }

}