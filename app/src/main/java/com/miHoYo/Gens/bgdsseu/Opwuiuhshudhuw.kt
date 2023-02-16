package com.miHoYo.Gens.bgdsseu

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Opwuiuhshudhuw(kcoxvko: Application): ViewModel() {
    val rokodoijsfijfsd = kcoxvko.packageManager



    fun rokekokodf(gkovkokob: String) {
        OneSignal.setExternalUserId(
            gkovkokob,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(otkorjijigf: JSONObject) {
                    try {
                        if (otkorjijigf.has("push") && otkorjijigf.getJSONObject("push").has("success")) {
                            val sokosdkoa = otkorjijigf.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $sokosdkoa"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (otkorjijigf.has("email") && otkorjijigf.getJSONObject("email").has("success")) {
                            val zoxzijiax =
                                otkorjijigf.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $zoxzijiax"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (otkorjijigf.has("sms") && otkorjijigf.getJSONObject("sms").has("success")) {
                            val ookokdjisf = otkorjijigf.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $ookokdjisf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun dokkocjivj(zoijx: WebView): WebSettings{
        val pfokkofggko = zoijx.settings
        pfokkofggko.domStorageEnabled = true
        pfokkofggko.setSupportZoom(true)
        pfokkofggko.javaScriptEnabled = true
        pfokkofggko.allowContentAccess = true
        pfokkofggko.allowFileAccess = true
        pfokkofggko.javaScriptCanOpenWindowsAutomatically = true

        pfokkofggko.mediaPlaybackRequiresUserGesture = false
        pfokkofggko.useWideViewPort = true
        pfokkofggko.loadWithOverviewMode = true
        pfokkofggko.allowContentAccess = true
        pfokkofggko.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        pfokkofggko.userAgentString = pfokkofggko.userAgentString.replace("; wv", "")
        pfokkofggko.cacheMode = WebSettings.LOAD_DEFAULT
        pfokkofggko.displayZoomControls = false
        pfokkofggko.builtInZoomControls = true
        pfokkofggko.setSupportMultipleWindows(false)
        pfokkofggko.pluginState = WebSettings.PluginState.ON

        pfokkofggko.allowFileAccess = true



        return pfokkofggko
    }




    fun ookokokdjisjif(vocbkobv: String): Boolean {
        try {
            rokodoijsfijfsd.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }





}