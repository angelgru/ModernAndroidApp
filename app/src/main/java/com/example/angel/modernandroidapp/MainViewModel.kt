package com.example.angel.modernandroidapp

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class MainViewModel: ViewModel() {

    var repoModel: RepoModel = RepoModel()
    val text: ObservableField<String> = ObservableField("Old data")
    val isLoading: ObservableField<Boolean> = ObservableField()
    var repositories: ArrayList<Repository> = ArrayList()

    fun loadRepositories() {
        isLoading.set(true)
        repositories = repoModel.getRepositories()
        isLoading.set(false)
    }
}