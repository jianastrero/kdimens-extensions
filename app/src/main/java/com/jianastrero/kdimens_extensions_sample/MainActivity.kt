package com.jianastrero.kdimens_extensions_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.setPadding
import com.jianastrero.kdimens_extensions.dp
import com.jianastrero.kdimens_extensions.sp
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTextView.setPadding(24.dp.toInt())
        tvTextView.textSize = 8.sp.toFloat()
    }
}