package com.adyy.daggerhilt.data.repository

import android.app.Application
import com.adyy.daggerhilt.R
import com.adyy.daggerhilt.data.MyApi
import com.adyy.daggerhilt.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {
    init{
       val appName =  appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }

}