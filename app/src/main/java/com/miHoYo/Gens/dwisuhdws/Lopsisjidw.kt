package com.miHoYo.Gens.dwisuhdws

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.Gens.R
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Lopsisjidw : Fragment() {
    val xoxijcjiasjic by activityViewModel<Fowoosijdijwhusd>(named("MainModel"))
    private lateinit var forijdisjfjisudfeyg: Context




    override fun onAttach(context: Context) {
        super.onAttach(context)
        forijdisjfjisudfeyg=context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.usyioaskdw, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        xoxijcjiasjic.ggogfokogfijjicxjivhuxchu(forijdisjfjisudfeyg)

        findNavController().navigate(R.id.aoksoskaji)

    }


}