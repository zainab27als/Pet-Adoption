package com.nbk.petadoption.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nbk.petadoption.communication.PetRepository
import com.nbk.petadoption.data.PetsDTO
import kotlinx.coroutines.launch

class PetViewModel: ViewModel() {
    private val repository = PetRepository()

    var petList by mutableStateOf<List<PetsDTO>>(emptyList())
    var isLoading by mutableStateOf(true)
    var isError by mutableStateOf(false)

    init {
        loadPets()
    }

    private fun loadPets() {
        viewModelScope.launch {
            try {
                isLoading = true
                petList = repository.fetchPets()
                isError = false
            } catch (e: Exception) {
                isError = true
            } finally {
                isLoading = false
            }
        }
    }
}