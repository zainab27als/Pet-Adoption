package com.nbk.petadoption.communication

import com.nbk.petadoption.data.PetsDTO
import retrofit2.http.GET

interface APIinterface {
    @GET("pets")
    suspend fun getPets(): List<PetsDTO>
}