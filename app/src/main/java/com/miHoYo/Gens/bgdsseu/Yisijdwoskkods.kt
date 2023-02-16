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
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.wookskod
import com.miHoYo.Gens.dwisuhdws.Fowoosijdijwhusd
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Yisijdwoskkods : Fragment() {
    lateinit var doskofkooskdf: String
    private lateinit var rkodkofoksf: Context
    val nobkkbnnkob by activityViewModel<Fowoosijdijwhusd>(named("MainModel"))

    val okekooksdoksd: SharedPreferences by inject(named("SharedPreferences"))




    override fun onAttach(context: Context) {
        super.onAttach(context)
        rkodkofoksf = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.nhyfdfgdf, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tooifjjig = okekooksdoksd.getString(wookskod, null)
        val fokdskofjidshufeuwufhus = okekooksdoksd.getString("appCamp", null)

        if (tooifjjig=="1" &&fokdskofjidshufeuwufhus == null) {
            nobkkbnnkob.codoocoixjjiijvhudshu(rkodkofoksf)
            nobkkbnnkob.ovkcijbij.observe(viewLifecycleOwner) {
                if (it != null) {
                    doskofkooskdf = it.toString()
                    okekooksdoksd.edit().putString("appCamp", doskofkooskdf).apply()
                    findNavController().navigate(R.id.riojifijjig)
                }
            }
        } else {
            findNavController().navigate(R.id.riojifijjig)
        }
    }







}