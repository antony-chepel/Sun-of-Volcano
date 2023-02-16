package com.miHoYo.Gens.bgdsseu

import android.app.Application
import android.content.Context
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.ogkfkojifgi
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.vockcvjijids
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.pwoskoadijiasdjisadji
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.ocvkbko
import com.my.tracker.MyTracker
import com.onesignal.OneSignal

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Kioswduuwsd: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ocvkbko)

        val eoosdidjia = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val nxjcjvusdgysgysydgv = getSharedPreferences("PREFS_NAME", 0)

        val roeokkosdijijasdji = MyTracker.getTrackerParams()
        val soookkozxkocko = MyTracker.getTrackerConfig()
        val ytdussdjjif = MyTracker.getInstanceId(this)
        soookkozxkocko.isTrackingLaunchEnabled = true
        val oxzckzxkocji = UUID.randomUUID().toString()

        if (nxjcjvusdgysgysydgv.getBoolean("my_first_time", true)) {
            roeokkosdijijasdji.setCustomUserId(oxzckzxkocji)
            eoosdidjia.edit().putString(ogkfkojifgi, oxzckzxkocji).apply()
            eoosdidjia.edit().putString(vockcvjijids, ytdussdjjif).apply()
            nxjcjvusdgysgysydgv.edit().putBoolean("my_first_time", false).apply()
        } else {
            val jjcuxhhuxv = eoosdidjia.getString(ogkfkojifgi, oxzckzxkocji)
            roeokkosdijijasdji.setCustomUserId(jjcuxhhuxv)
        }
        MyTracker.initTracker(pwoskoadijiasdjisadji, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Kioswduuwsd)
            modules(
                listOf(
                    forkookdkoskof, eoooosijdijds
                )
            )
        }
    }
}