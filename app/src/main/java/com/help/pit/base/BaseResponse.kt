package com.help.pit.base

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("data") val data: T,
    @SerializedName("status_code") val statusCode: Int,
    @SerializedName("message") val message: String,
)