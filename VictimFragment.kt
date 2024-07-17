package com.example.localstealcon.MainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localstealcon.DialogFragments.AddVictimDialog
import com.example.localstealcon.R

class VictimFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_victim, container, false)

        val addVictimDialog =  AddVictimDialog()
        addVictimDialog.show(childFragmentManager, "add_victim_dialog")
    }
}
