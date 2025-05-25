package com.nbk.petadoption

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nbk.petadoption.ui.theme.PetAdoptionTheme
import com.nbk.petadoption.viewmodel.PetViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nbk.petadoption.composables.PetCard
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
