package com.aurigaone.network

import kotlinx.coroutines.flow.MutableSharedFlow

object AuthHandler {
    /**
     * When this flow emits an event, it means that the user is logged out and should be redirected
     * to the login screen.
     */
    val shouldLogOutUser = MutableSharedFlow<Boolean>()

    suspend fun logout() {
        shouldLogOutUser.emit(true)
    }
}