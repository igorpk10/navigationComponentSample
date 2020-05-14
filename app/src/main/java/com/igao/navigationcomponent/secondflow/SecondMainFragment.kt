package com.igao.navigationcomponent.secondflow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.igao.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_second_main.view.*

class SecondMainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_main, container, false)

        view.btn_to_second_fragment.setOnClickListener {
            navigateToSecondFragment()
        }

        return view
    }

    private fun navigateToSecondFragment(){
        findNavController().navigate(R.id.action_secondMainFragment_to_secondFragment)
    }

}
