package com.miHoYo.Gens.dwisuhdws

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import com.miHoYo.Gens.bgdsseu.Ewuiijsjida
import com.miHoYo.Gens.bgdsseu.Zuisisisjdwu
import com.miHoYo.Gens.databinding.ActivityCososidwdjiBinding
import kotlin.random.Random

class Cososidwdji : AppCompatActivity() {
    private var icjxvjixcij: CountDownTimer? = null
    private lateinit var oekkokods: SharedPreferences
    var poopsokadkos = 0
    private lateinit var xzhuuhs : ActivityCososidwdjiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xzhuuhs = ActivityCososidwdjiBinding.inflate(layoutInflater)
        setContentView(xzhuuhs.root)
        oekkokods = getSharedPreferences("scores", MODE_PRIVATE)
        poopsokadkos = oekkokods.getInt("scores",0)
        xzhuuhs.bLaunch.setOnClickListener {
            okfdgkof()
        }

    }


    private fun okfdgkof() = with(xzhuuhs){
        var pppxockocx = 0
        icjxvjixcij?.cancel()
        icjxvjixcij = object : CountDownTimer(4000,100){
            override fun onTick(millisUntilFinished: Long) {
                pppxockocx++
                bLaunch.alpha = 0.7f
                bLaunch.isClickable = false
                if(pppxockocx>5)pppxockocx = 0
                sokd.setImageResource(Ewuiijsjida.isahudashu[pppxockocx])
                mckxijjidsf.setImageResource(Ewuiijsjida.isahudashu[pppxockocx])
                bvjibivjivbj.setImageResource(Ewuiijsjida.isahudashu[pppxockocx])


            }

            override fun onFinish() {
                bLaunch.isClickable = true
                bLaunch.alpha = 1.0f
                  okwkosokdokasdk()
                     Handler().postDelayed({
                         startActivity(
                             Intent(this@Cososidwdji, Zuisisisjdwu::class.java))
                     },1000)




            }

        }.start()
    }


    private fun okwkosokdokasdk() = with(xzhuuhs){
        val mkcvb = Ewuiijsjida.isahudashu[Random.nextInt(6)]
        val otokkfkg = Ewuiijsjida.isahudashu[Random.nextInt(6)]
        val oaokaskokoas = Ewuiijsjida.isahudashu[Random.nextInt(6)]

        val okcoxko = Ewuiijsjida.psaodijsaji[Random.nextInt(9)]

        val eokkodf = poopsokadkos + okcoxko
        oekkokods.edit().putInt("scores",eokkodf).apply()

        sokd.setImageResource(mkcvb)
        mckxijjidsf.setImageResource(otokkfkg)
        bvjibivjivbj.setImageResource(oaokaskokoas)

    }


    override fun onDestroy() {
        super.onDestroy()
        icjxvjixcij?.cancel()
    }
}