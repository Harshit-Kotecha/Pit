package com.help.pit.base

import com.help.pit.commons.AppMode

object EnvironmentManager {
    private var _appMode: AppMode = AppMode.DONATE

    var appMode
        get() = _appMode
        set(value) { _appMode = value }

    fun setEnvironment(mode: AppMode) {
        appMode = mode
    }
}