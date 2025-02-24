package com.help.pit.network

import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi

class NetworkManager(private val connectivityManager: ConnectivityManager) {
    private val listeners by lazy { hashSetOf<NetworkListener>() }

    fun isInternetAvailable(): Boolean {
        return isNetworkConnected()
    }

    private fun isNetworkConnected(): Boolean {
        val capabilities =
            connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
        capabilities.also {
            if (it != null) {
                if (it.hasTransport(NetworkCapabilities.TRANSPORT_WIFI))
                    return true
                else if (it.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                    return true
                }
            }
        }
        return false
    }


    inner class NetworkCallbackListener : ConnectivityManager.NetworkCallback() {
        override fun onAvailable(network: Network) {
            super.onAvailable(network)
            synchronized(this@NetworkManager) {
                if (isInternetAvailable()) {
                    Log.e("Ok", "Network onAvailable $network")
                    listeners.forEach { it.onAvailability(isInternetAvailable(), network) }
                }
            }
        }

        override fun onLost(network: Network) {
            super.onLost(network)
            synchronized(this@NetworkManager) {
                if (!isInternetAvailable()) {
                    Log.e("Ok", "Network onLost $network")
                    listeners.forEach { it.onAvailability(!isInternetAvailable(), network) }
                }
            }
        }
    }

    interface NetworkListener {
        fun onAvailability(
            isAvailable: Boolean,
            network: Network?,
        )
    }
}