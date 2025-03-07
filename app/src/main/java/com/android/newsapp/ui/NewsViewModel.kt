package com.android.newsapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.newsapp.data.NewsRepository
import com.android.newsapp.data.local.entity.NewsEntity
import kotlinx.coroutines.launch

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {

    fun getHeadlineNews() = newsRepository.getHeadlineNews()

    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()

    fun saveNews(news: NewsEntity) {
        viewModelScope.launch {
            newsRepository.setNewsBookmark(news, true)
        }
    }

    fun deleteNews(news: NewsEntity) {
        viewModelScope.launch {
            newsRepository.setNewsBookmark(news, false)
        }
    }
}
//class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
//    fun getHeadlineNews() = newsRepository.getHeadlineNews()
//
//    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()
//    fun saveNews(news: NewsEntity){
//        newsRepository.setBookmarkedNews(news,true)
//    }
//    fun deleteNews(news: NewsEntity){
//        newsRepository.setBookmarkedNews(news,false)
//    }
//}