package com.adyy.daggerhilt.data.di

import android.app.Application
import com.adyy.daggerhilt.data.MyApi
import com.adyy.daggerhilt.data.repository.MyRepositoryImpl
import com.adyy.daggerhilt.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.intellij.lang.annotations.PrintFormat
import retrofit2.Retrofit
import javax.inject.Named
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

//    @Provides
//    @Singleton
//    fun provideMyRepository(api: MyApi , app: Application, hello1: String): MyRepository{
//        return MyRepositoryImpl(api , app)
//    }


    //Named to avoid instance conflict
    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"



}