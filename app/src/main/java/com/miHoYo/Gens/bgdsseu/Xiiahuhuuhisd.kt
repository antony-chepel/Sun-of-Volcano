package com.miHoYo.Gens.bgdsseu

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import android.view.ViewGroup
import com.miHoYo.Gens.R
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.ovcokbkov
import com.miHoYo.Gens.dwisuhdws.Fowoosijdijwhusd
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Xiiahuhuuhisd : Fragment() {
    lateinit var fokdfijjgir: String
    val uffjiijfdjiuhchuxuvh by activityViewModel<Fowoosijdijwhusd>(named("MainModel"))
    private lateinit var koksdjiijwd: Context
    val icjvjicji: SharedPreferences by inject(named("SharedPreferences"))


    override fun onAttach(context: Context) {
        super.onAttach(context)
        koksdjiijwd = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.xzoxijjisd, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uffjiijfdjiuhchuxuvh.okdfjisdfj.observe(viewLifecycleOwner) {
            if (it!=null) {
                fokdfijjgir = it.okbvkoko
                icjvjicji.edit().putString(ovcokbkov, fokdfijjgir).apply()
                findNavController().navigate(R.id.zoizijsuahgydwgyd)
            }
        }
    }






}