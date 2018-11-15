package com.example.android.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    //Inflating and Returning the View with DataBindingUtil
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)

//        binding.playButton.setOnClickListener { v: View ->
//            v.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
//        }

        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.playButton.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )
        return binding.root
    }
}


