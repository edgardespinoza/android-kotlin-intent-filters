package com.eespinor.intentfilters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.eespinor.intentfilters.ui.theme.IntentFiltersTheme

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentFiltersTheme {
                Text(text = "SecondActivity")
            }
        }
    }
}