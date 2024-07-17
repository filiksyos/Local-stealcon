package com.example.localstealcon.DialogFragments

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import com.example.localstealcon.R

class AddWordDialog : DialogFragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return Dialog(requireContext()).apply {
            setContentView(R.layout.word_dialog_layout)

            // Find views within the dialog layout (text field, buttons)
            val wordTextField = findViewById<EditText>(R.id.word_text_field)
            val meaningTextField = findViewById<EditText>(R.id.meaning_text_field)
            val okButton = findViewById<Button>(R.id.ok_button)
            val exitButton = findViewById<Button>(R.id.exit_button)

            // Set up button click listeners
            okButton.setOnClickListener {
                // Handle OK button click (e.g., get text from text field)
                dismiss()
            }
            exitButton.setOnClickListener {
                dismiss()
            }
        }
    }
}
