package com.mmj.lifecycle.presentation.first

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mmj.lifecycle.presentation.util.observeLifecycleEvents
import com.mmj.lifecycle.presentation.util.resource.route.AppScreen

@Composable
fun FirstScreen(
    navController: NavController,
    viewModel: FirstViewModel = hiltViewModel()
) {
    viewModel.observeLifecycleEvents(LocalLifecycleOwner.current.lifecycle)

    Button(
        onClick = {
            navController.navigate(AppScreen.SecondScreen.route)
        },
        modifier = Modifier.wrapContentSize()
    ) {
        Text(text = "Second")
    }
}