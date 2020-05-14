package com.igao.navigationcomponent.mainflow

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.igao.navigationcomponent.R
import com.igao.navigationcomponent.secondflow.SecondActivity
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        view.button_nav_to_second.setOnClickListener {
            navigateToSecondFragment()
        }

        view.button_another_nav.setOnClickListener {
            callSecondActivity()
        }

        return view
    }

    private fun navigateToSecondFragment() {
        findNavController().navigate(R.id.action_mainFragment_to_mainSecondFragment)
    }

    private fun callSecondActivity() {
        context?.let { context ->
            startActivity(Intent(context, SecondActivity::class.java))
        }
    }
}
