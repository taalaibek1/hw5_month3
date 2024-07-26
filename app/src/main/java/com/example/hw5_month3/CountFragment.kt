package com.example.hw5_month3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CountFragment : Fragment() {

    private var count = 0
    private lateinit var countTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_count, container, false)

        countTextView = view.findViewById(R.id.tv_counter)
        val buttonIncrement: Button = view.findViewById(R.id.btn_plus)
        val buttonDecrement: Button = view.findViewById(R.id.btn_minus)

        buttonIncrement.setOnClickListener {
            count++
            updateCountTextView()
        }

        buttonDecrement.setOnClickListener {
            count--
            updateCountTextView()
        }

        return view
    }

    private fun updateCountTextView() {
        countTextView.text = count.toString()
    }
}
