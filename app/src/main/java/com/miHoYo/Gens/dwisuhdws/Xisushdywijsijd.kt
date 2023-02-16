package com.miHoYo.Gens.dwisuhdws

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.miHoYo.Gens.R
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.lsoakdoasok
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.vijcjib
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.toorkkdosjifjids
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.otkokodof
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.wookskod
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.wpwwqpsoaodkokasd
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.poxozcjiijs
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.ogkfkojifgi
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.rokkodkof
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.riokodkofko
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.wpskoadookasd
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.vockcvjijids
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.zoxkzokxkoakooks
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.ovcokbkov
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.bibjvgjf
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.opeokdkofksok
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.goktkokookgkof
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named



class Xisushdywijsijd : Fragment() {
    val fokrkofiggjif: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var locijhuhuxc: Context





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rokokdkof = AppsFlyerLib.getInstance().getAppsFlyerUID(locijhuhuxc)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val cvkocxko = Intent(activity, Utwisijidjhsda::class.java)
        val ncizxj = "com.miHoYo.Gens"
        val qpwkoskods = Build.VERSION.RELEASE
        val eokoksdfko = Intent(activity, Wusisjjisd::class.java)
        val kiisdijajis = fokrkofiggjif.getString(ovcokbkov, null)
        val sdjisdjis = fokrkofiggjif.getString("appCamp", null)

        val iocvjivbji = fokrkofiggjif.getString("mainId", null)
        val kcxivijjicxuds = fokrkofiggjif.getString("deepSt", null)
        val vijcbjiv = fokrkofiggjif.getString(ogkfkojifgi, null)
        val sokdkook = fokrkofiggjif.getString(toorkkdosjifjids, null)
        val aplplzkoxkoa: String? = fokrkofiggjif.getString(vockcvjijids, null)
        val otkodoksokf = fokrkofiggjif.getString(otkokodof, null)
        val oskadjiwij = fokrkofiggjif.getString(wookskod, null)


        fokrkofiggjif.edit().putString(lsoakdoasok, rokokdkof).apply()

        val rokkdof = "$sokdkook$goktkokookgkof$sdjisdjis&$rokkodkof$rokokdkof&$zoxkzokxkoakooks$iocvjivbji&$bibjvgjf$ncizxj&$poxozcjiijs$qpwkoskods&$riokodkofko$wpskoadookasd"
        val mcvkkovkxc = "$sokdkook$rokkodkof$vijcbjiv&$zoxkzokxkoakooks$aplplzkoxkoa&$bibjvgjf$ncizxj&$poxozcjiijs$qpwkoskods&$riokodkofko$wpskoadookasd"
        val aplslpsaplals = "$sokdkook$goktkokookgkof$kcxivijjicxuds&$rokkodkof$rokokdkof&$zoxkzokxkoakooks$iocvjivbji&$bibjvgjf$ncizxj&$poxozcjiijs$qpwkoskods&$riokodkofko$vijcjib"
        val tiokodkof = "$sokdkook$goktkokookgkof$kcxivijjicxuds&$rokkodkof$vijcbjiv&$zoxkzokxkoakooks$aplplzkoxkoa&$bibjvgjf$ncizxj&$poxozcjiijs$qpwkoskods&$riokodkofko$vijcjib"

        when(oskadjiwij) {
            "1" ->
                if(sdjisdjis!!.contains(opeokdkofksok)) {
                    fokrkofiggjif.edit().putString(wpwwqpsoaodkokasd, rokkdof).apply()
                    fokrkofiggjif.edit().putString("WebInt", "campaign").apply()
                    startActivity(eokoksdfko)
                    activity?.finish()
                } else if (kcxivijjicxuds!=null||otkodoksokf!!.contains(kiisdijajis.toString())) {
                    fokrkofiggjif.edit().putString(wpwwqpsoaodkokasd, aplslpsaplals).apply()
                    fokrkofiggjif.edit().putString("WebInt", "deepLink").apply()
                    startActivity(eokoksdfko)
                    activity?.finish()
                } else {
                    startActivity(cvkocxko)
                    activity?.finish()
                }
            "0" ->
                if(kcxivijjicxuds!=null) {
                    fokrkofiggjif.edit().putString(wpwwqpsoaodkokasd, tiokodkof).apply()
                    fokrkofiggjif.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(eokoksdfko)
                    activity?.finish()
                } else if (otkodoksokf!!.contains(kiisdijajis.toString())) {
                    fokrkofiggjif.edit().putString(wpwwqpsoaodkokasd, mcvkkovkxc).apply()
                    fokrkofiggjif.edit().putString("WebInt", "geo").apply()
                    startActivity(eokoksdfko)
                    activity?.finish()
                } else {
                    startActivity(cvkocxko)
                    activity?.finish()
                }
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        locijhuhuxc = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.psoaldji, container, false)
    }

}
