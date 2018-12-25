package com.example.angel.modernandroidapp

class RepoModel {

    fun getRepositories(): ArrayList<Repository> {
        var arrayList:ArrayList<Repository> = ArrayList<Repository>()
        arrayList.add(Repository("First", "Owner 1", 100, false))
        arrayList.add(Repository("Second", "Owner 2", 30,true))
        arrayList.add(Repository("Third", "Owner 3", 439,false))
        return arrayList
    }
}