package com.nbk.petadoption

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nbk.petadoption.ui.theme.PetAdoptionTheme
import com.nbk.petadoption.viewmodel.PetViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nbk.petadoption.composables.PetListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetAdoptionTheme {
               val viewModel: PetViewModel = viewModel()
                PetListScreen(viewModel)
            }
        }
    }
}
