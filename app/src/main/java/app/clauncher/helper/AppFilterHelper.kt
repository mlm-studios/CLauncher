package app.clauncher.helper

import app.clauncher.data.AppModel

interface AppFilterHelper {
    fun onAppFiltered(items:List<AppModel>)
}