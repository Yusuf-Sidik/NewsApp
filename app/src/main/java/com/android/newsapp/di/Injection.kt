package com.android.newsapp.di

import android.content.Context
import com.android.newsapp.data.NewsRepository
import com.android.newsapp.data.local.room.NewsDatabase
import com.android.newsapp.data.remote.retrofit.ApiConfig
import com.android.newsapp.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): NewsRepository{
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        val appExecutors = AppExecutors()
        return NewsRepository.getInstance(apiService,dao,appExecutors)
    }
}