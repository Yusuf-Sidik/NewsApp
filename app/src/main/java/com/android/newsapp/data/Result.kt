package com.android.newsapp.data

import kotlin.Result

sealed class Result<out R> private constructor(){
    data class Success<out T> (val data: T) : com.android.newsapp.data.Result<T>()
    data class Error(val error: String) : com.android.newsapp.data.Result<Nothing>()
    object Loading : com.android.newsapp.data.Result<Nothing>()
}