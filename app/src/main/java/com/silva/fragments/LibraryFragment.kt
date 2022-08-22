package com.silva.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView


class LibraryFragment : Fragment(R.layout.fragment_library) {
    private lateinit var addButton: ImageButton
    private lateinit var numberOfSongs: TextView
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        addButton = view.findViewById(R.id.add_song)
        numberOfSongs = view.findViewById(R.id.number_liked_songs)
        super.onViewCreated(view, savedInstanceState)
        setListeners()
    }

    @SuppressLint("SetTextI18n")
    fun setListeners(){
        addButton.setOnClickListener{
            counter++
            numberOfSongs.text = "$counter Songs"
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

}