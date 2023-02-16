package com.miHoYo.Gens.bgdsseu

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.miHoYo.Gens.dwisuhdws.Fowoosijdijwhusd
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val eoooosijdijds = module {

    single  <Rqiisjidji> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Rqiisjidji::class.java)
    }

    single <Towoskdjijisd> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Towoskdjijisd::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://sunofvolcano.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Uisoiwijusuhduhsahux(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Dozijxijjis(get(named("HostInter")))
    }
    single{
        jocopxohuhudf()
    }
    single (named("SharedPreferences")) {
        appasokasko(androidApplication())
    }
}

fun appasokasko(rokdsokf: Application): SharedPreferences {
    return rokdsokf.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun jocopxohuhudf(): Gson {
    return GsonBuilder().create()
}

val forkookdkoskof = module {
    viewModel (named("MainModel")){
        Fowoosijdijwhusd((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Opwuiuhshudhuw(get())
    }
}