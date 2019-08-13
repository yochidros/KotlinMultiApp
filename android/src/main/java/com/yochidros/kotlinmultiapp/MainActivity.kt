package com.yochidros.kotlinmultiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yochidros.common.createApplicationScreenMessage
import com.yochidros.common.currentTimeSeconds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view.text = createApplicationScreenMessage() + currentTimeSeconds().toString()

    }
}
