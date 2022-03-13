package com.example.fastingapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.fastingapp.R


const val ARG_OBJECT = "object"
class FirstScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val imageView: ImageView = view.findViewById(R.id.imageView)
            val tvChange: TextView = view.findViewById(R.id.tvChange)
            val count: Int = getInt(ARG_OBJECT)

            if(count == 1) {
                imageView.setImageResource(R.drawable.lloyd)
                tvChange.text = "Текст первой вкладки"
            } else if (count == 2) {
                imageView.setImageResource(R.drawable.second)
                tvChange.text = "Текст второй вкладки"
            } else if (count == 3) {
                imageView.setImageResource(R.drawable.third)
                tvChange.text = "Текст третьей вкладки"
            } else if (count == 4) {
                imageView.setImageResource(R.drawable.four)
                tvChange.text = "Текст последгей вкладки"
            }
        }
    }
}


