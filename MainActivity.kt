package com.example.localstealcon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.localstealcon.ViewModel.VictimViewModel
import com.example.localstealcon.ViewModel.WordViewModel

class MainActivity : AppCompatActivity() {

    lateinit var victimViewModel: VictimViewModel
    lateinit var wordViewModel:   WordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}
