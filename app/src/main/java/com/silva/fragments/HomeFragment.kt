package com.silva.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
private const val ARG_PARAM1 = "param1"

class HomeFragment : Fragment(R.layout.fragment_home) {
    private var param1: String? = null
    private lateinit var name_text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        name_text = view.findViewById(R.id.name_textview)
        name_text.text = param1 ?: "Sin texto"
        super.onViewCreated(view, savedInstanceState)
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}