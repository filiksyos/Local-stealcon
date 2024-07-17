package com.example.localstealcon.MainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.localstealcon.DialogFragments.AddWordDialog
import com.example.localstealcon.R

class WordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_word, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val addWordButton = view.findViewById<Button>(R.id.addWordFab)
        addWordButton.setOnClickListener {
            val addWordDialog = AddWordDialog()
            addWordDialog.show(childFragmentManager, "add_word_dialog")
        }
    }
}
