package com.miHoYo.Gens.bgdsseu

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


class Uisoiwijusuhduhsahux(private val gijijbji: Towoskdjijisd) {
    suspend fun yysyysidjsi() = gijijbji.hjiijbi()
}


@Keep
data class Rowokskokodjixjic(
    @SerializedName("geo")
    val nmvcijjcvijiifj: String,
    @SerializedName("view")
    val oqookkosodpldspadx: String,
    @SerializedName("appsChecker")
    val gookijfijijdkodfko: String,
)

interface Towoskdjijisd {
    @GET("json/?key=LbwKKoO9eF4GLMz")
    suspend fun hjiijbi(): Response<Gwooskodijjisd>
}

class Dozijxijjis(private val osodkos: Rqiisjidji) {
    suspend fun forokdkof() = osodkos.gookovkokb()
}


@Keep
data class Gwooskodijjisd(
    @SerializedName("countryCode")
    val okbvkoko: String,
)


interface Rqiisjidji {
    @GET("typo.json")
    suspend fun gookovkokb(): Response<Rowokskokodjixjic>
}






