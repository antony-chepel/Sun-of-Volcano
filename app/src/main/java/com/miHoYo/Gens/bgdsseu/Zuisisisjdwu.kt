package com.miHoYo.Gens.bgdsseu

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miHoYo.Gens.databinding.ActivityZuisisisjdwuBinding
import com.miHoYo.Gens.dwisuhdws.Utwisijidjhsda
import kotlin.random.Random

class Zuisisisjdwu : AppCompatActivity() {
    private lateinit var xzygs : SharedPreferences
    private lateinit var xkzcmzxmk : ActivityZuisisisjdwuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xkzcmzxmk = ActivityZuisisisjdwuBinding.inflate(layoutInflater)
        setContentView(xkzcmzxmk.root)
        xzygs = getSharedPreferences("scores", MODE_PRIVATE)
        iookasidj()
    }

    private fun iookasidj() = with(xkzcmzxmk){
        val sadji = xzygs.getInt("scores",0)
        val lxlzoczkox = Ewuiijsjida.tsrasudh[Random.nextInt(6)]
        val sjsdji = sadji + lxlzoczkox
        tvPwr.text = "Your wild power is : $sjsdji points"
        bPlAg.setOnClickListener { startActivity(Intent(this@Zuisisisjdwu, Utwisijidjhsda::class.java)) }
    }
}