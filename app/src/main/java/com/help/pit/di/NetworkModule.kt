package com.help.pit.di

import android.content.Context
import android.net.ConnectivityManager
import com.help.pit.api.Api
import com.help.pit.network.NetworkClient
import com.help.pit.network.NetworkManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideNetworkManager(
        @ApplicationContext context: Context,
    ): NetworkManager {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return NetworkManager(connectivityManager)
    }

    @Singleton
    @Provides
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
    ): Retrofit {
        return NetworkClient.provideRetrofit(okHttpClient)
    }

    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): Api {
        return retrofit.create(Api::class.java)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        networkManager: NetworkManager,
    ): OkHttpClient {
        return NetworkClient.provideOkHttp(networkManager)
    }
}