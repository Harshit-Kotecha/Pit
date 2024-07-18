package com.aurigaone.network

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import com.help.pit.network.NetworkManager
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

@SuppressLint("MissingPermission")
class NoInternetInterceptor(private val networkManager: NetworkManager) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        return if (!networkManager.isInternetAvailable()) {
            throw NoInternetException()
        } else {
            chain.proceed(chain.request())
        }
    }
}

class NoInternetException : IOException()