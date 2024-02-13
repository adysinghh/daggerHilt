package com.adyy.daggerhilt.data.repository

import com.adyy.daggerhilt.data.MyApi
import com.adyy.daggerhilt.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi
): MyRepository {
    override suspend fun doNetworkCall() {

    }

}