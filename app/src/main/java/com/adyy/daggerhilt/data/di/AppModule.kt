package com.adyy.daggerhilt.data.di

import com.adyy.daggerhilt.data.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //SingletonComponent -> dependency will live until the whole Application does
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi() : MyApi{
        return  Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }


}