package com.adyy.daggerhilt

import androidx.lifecycle.ViewModel
import com.adyy.daggerhilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class MyViewModel(
    private val repository: MyRepository
): ViewModel() {



}