package com.nbk.petadoption.communication

import com.nbk.petadoption.data.PetsDTO

class PetRepository {
    private val api = RetrofitHelper.instance.create(APIinterface::class.java)

    suspend fun fetchPets(): List<PetsDTO> {
        return api.getPets()
    }
}