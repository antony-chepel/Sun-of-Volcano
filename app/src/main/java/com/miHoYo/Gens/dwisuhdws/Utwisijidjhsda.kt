package com.miHoYo.Gens.dwisuhdws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miHoYo.Gens.databinding.ActivityUtwisijidjhsdaBinding

class Utwisijidjhsda : AppCompatActivity() {
    private lateinit var uhcxjiijdf : ActivityUtwisijidjhsdaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uhcxjiijdf = ActivityUtwisijidjhsdaBinding.inflate(layoutInflater)
        setContentView(uhcxjiijdf.root)

        uhcxjiijdf.sSunStrt.setOnClickListener {
         startActivity(Intent(this,Nosospadjiws::class.java))
        }

        uhcxjiijdf.bSunQuit.setOnClickListener {
            finish()
        }
    }
}