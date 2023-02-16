package com.miHoYo.Gens.bgdsseu

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.Gens.R
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.toorkkdosjifjids
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.otkokodof
import com.miHoYo.Gens.dwisuhdws.Fowoosijdijwhusd
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Tososijdjixcx : Fragment() {
    lateinit var rokokdkofko: String
    lateinit var lspoaodksjia: String
    lateinit var foofdjijigf: String

    val fokorokdkof by activityViewModel<Fowoosijdijwhusd>(named("MainModel"))
    val wokskodko: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var xokczkoko: Context








    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.oiuhxygcs, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        xokczkoko = context
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fokorokdkof.vhuchuygcyg.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                wokskodko.edit().putString("mainId", main).apply()
            }
        }

        fokorokdkof.okvvcjifjidij.observe(viewLifecycleOwner) {
            if (it != null) {

                lspoaodksjia = it.nmvcijjcvijiifj
                foofdjijigf = it.gookijfijijdkodfko
                rokokdkofko = it.oqookkosodpldspadx

                wokskodko.edit().putString(otkokodof, lspoaodksjia).apply()
                wokskodko.edit().putString(Polsoiwjijisjid.wookskod, foofdjijigf).apply()
                wokskodko.edit().putString(toorkkdosjifjids, rokokdkofko).apply()

                findNavController().navigate(R.id.aooakskoaji)
            }
        }
    }
}