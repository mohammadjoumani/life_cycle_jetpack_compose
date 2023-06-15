package com.mmj.lifecycle.presentation.second

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import com.mmj.lifecycle.presentation.util.ComposableLifecycle

@Composable
fun SecondScreen(
    viewModel: SecondViewModel = hiltViewModel()
) {
    val TAG = "SecondScreen"
    ComposableLifecycle { _, event ->
        when (event) {
            Lifecycle.Event.ON_CREATE -> {
                Log.d(TAG, "onCreate")
            }
            Lifecycle.Event.ON_START -> {
                Log.d(TAG, "On Start")
            }
            Lifecycle.Event.ON_RESUME -> {
                Log.d(TAG, "On Resume")
            }
            Lifecycle.Event.ON_PAUSE -> {
                Log.d(TAG, "On Pause")
            }
            Lifecycle.Event.ON_STOP -> {
                Log.d(TAG, "On Stop")
            }
            Lifecycle.Event.ON_DESTROY -> {
                Log.d(TAG, "On Destroy")
            }
            else -> {}
        }
    }
}