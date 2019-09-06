package com.domia.taskapp

import android.app.Application
import android.util.Log
import io.realm.Realm

class TaskApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("TaskApp.kt", "realm.init")
        Realm.init(this)
    }
}