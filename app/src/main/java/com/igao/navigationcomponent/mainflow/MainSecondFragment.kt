package com.igao.navigationcomponent.mainflow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.igao.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_main_second.view.*

class MainSecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_main_second, container, false)

        view.btn_nav_third_fragment.setOnClickListener{
            navigateToThirdFragment()
        }
        return view
    }

    private fun navigateToThirdFragment(){
        findNavController().navigate(R.id.action_mainSecondFragment_to_mainThirdFragment)
    }
}
