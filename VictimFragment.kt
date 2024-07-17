package com.example.localstealcon.MainFragments // Adjust package if needed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.localstealcon.DialogFragments.AddVictimDialog
import com.example.localstealcon.R // Adjust import if needed

class VictimFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_victim, container, false) // Use your actual layout file
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val addVictimButton = view.findViewById<Button>(R.id.addVictimFab) // Use your button's ID
        addVictimButton.setOnClickListener {
            val addVictimDialog = AddVictimDialog()
            addVictimDialog.show(childFragmentManager, "add_victim_dialog")
        }
    }
}
