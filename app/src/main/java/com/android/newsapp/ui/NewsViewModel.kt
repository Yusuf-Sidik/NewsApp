package com.android.newsapp.ui

import androidx.lifecycle.ViewModel
import com.android.newsapp.data.NewsRepository

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()
}