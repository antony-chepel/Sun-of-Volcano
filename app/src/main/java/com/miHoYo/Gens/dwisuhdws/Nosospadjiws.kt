package com.miHoYo.Gens.dwisuhdws

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import com.miHoYo.Gens.R
import com.miHoYo.Gens.databinding.ActivityNosospadjiwsBinding
import kotlin.random.Random

class Nosospadjiws : AppCompatActivity() {
    var sdpdsakooasdk = 0
    var cijxvjixvci = ArrayList<Int>()
    var sjidsd = 1
    private lateinit var sharedPreferences: SharedPreferences
    var asdjijasdji = ArrayList<Int>()
    var fodgkodf = ArrayList<Int>()
    var ovbjivb = 0
    private lateinit var oirkodksfko : ActivityNosospadjiwsBinding
    var cjixixcvji = true
    val sokadokdasosk = listOf(
        50,
        100,
        200,
        350,
        500,
        800,
        1000
    )
    var xjicjixcj = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oirkodksfko = ActivityNosospadjiwsBinding.inflate(layoutInflater)
        setContentView(oirkodksfko.root)
        sharedPreferences = getSharedPreferences("scores", MODE_PRIVATE)
    }







    fun dfojdfjisdjif() = with(oirkodksfko) {
        asdjijasdji.clear()
        fodgkodf.clear()
        cijxvjixvci.clear()
        sjidsd = 1;
        for (i in 1..9) {
            var ogkfkodf: ImageView?
            ogkfkodf = when (i) {
                1 -> button
                2 -> button2
                3 -> button3
                4 -> button4
                5 -> button5
                6 -> button6
                7 -> button7
                8 -> button8
                9 -> button9
                else -> {
                    button
                }
            }
            ogkfkodf.setImageResource(0)
            ogkfkodf.isEnabled = true
        }
    }


    fun sgdyywqyduqwudqwud(aisdjisd: ImageView, currCell: Int) {
        if (sjidsd == 1) {
            aisdjisd.setImageResource(R.drawable.sn_vlc_item_tal)
            val winfd = sokadokdasosk[Random.nextInt(7)]
            xjicjixcj += winfd
            oirkodksfko.tvWldScore.text = "Wild scores : $xjicjixcj"
            sharedPreferences.edit().putInt("scores",xjicjixcj).apply()
            asdjijasdji.add(currCell)
            cijxvjixvci.add(currCell)
            aisdjisd.isEnabled = false
            val checkWinner = ijcxvjixcji()
            if (checkWinner == 1) {
                Handler().postDelayed(Runnable { dfojdfjisdjif() }, 2000)
            }

        } else {
            aisdjisd.setImageResource(R.drawable.sn_vlc_item_tal)
            sjidsd = 1
            fodgkodf.add(currCell)
            val winfd = sokadokdasosk[Random.nextInt(7)]
            xjicjixcj += winfd
            oirkodksfko.tvWldScore.text = "Wild scores : $xjicjixcj"
            sharedPreferences.edit().putInt("scores",xjicjixcj).apply()
            cijxvjixvci.add(currCell)
            aisdjisd.isEnabled = false
            val checkWinner = ijcxvjixcji()
            if (checkWinner == 1)
                Handler().postDelayed(Runnable { dfojdfjisdjif() }, 4000)
        }

    }

    fun ofkdkogogf(sdodas: View) {
        if (cjixixcvji) {
            val ivibinbcni = sdodas as ImageView
            var eoksokdok = 0

            when (ivibinbcni.id) {
                R.id.button -> eoksokdok = 1
                R.id.button2 -> eoksokdok = 2
                R.id.button3 -> eoksokdok = 3
                R.id.button4 -> eoksokdok = 4
                R.id.button5 -> eoksokdok = 5
                R.id.button6 -> eoksokdok = 6
                R.id.button7 -> eoksokdok = 7
                R.id.button8 -> eoksokdok = 8
                R.id.button9 -> eoksokdok = 9

            }
            cjixixcvji = false;
            Handler().postDelayed(Runnable { cjixixcvji = true }, 600)
            sgdyywqyduqwudqwud(ivibinbcni, eoksokdok)

        }
    }

    fun fokdokgokdfo() =with(oirkodksfko) {
        for (i in 1..9) {
            val buttonSelected = when (i) {
                1 -> button
                2 -> button2
                3 -> button3
                4 -> button4
                5 -> button5
                6 -> button6
                7 -> button7
                8 -> button8
                9 -> button9
                else -> {
                    button
                }

            }
            if (buttonSelected.isEnabled == true)
                buttonSelected.isEnabled = false
        }
    }

    fun ijcxvjixcji(): Int {
        if ((asdjijasdji.contains(1) && asdjijasdji.contains(2) && asdjijasdji.contains(3)) || (asdjijasdji.contains(
                1
            ) && asdjijasdji.contains(4) && asdjijasdji.contains(7)) ||
            (asdjijasdji.contains(3) && asdjijasdji.contains(6) && asdjijasdji.contains(9)) || (asdjijasdji.contains(
                7
            ) && asdjijasdji.contains(8) && asdjijasdji.contains(9)) ||
            (asdjijasdji.contains(4) && asdjijasdji.contains(5) && asdjijasdji.contains(6)) || (asdjijasdji.contains(
                1
            ) && asdjijasdji.contains(5) && asdjijasdji.contains(9)) ||
            asdjijasdji.contains(3) && asdjijasdji.contains(5) && asdjijasdji.contains(7) || (asdjijasdji.contains(2) && asdjijasdji.contains(
                5
            ) && asdjijasdji.contains(8))
        ) {
            sdpdsakooasdk += 1
            fokdokgokdfo()

            startActivity(Intent(this@Nosospadjiws, Cososidwdji::class.java))
            return 1


        } else if ((fodgkodf.contains(1) && fodgkodf.contains(2) && fodgkodf.contains(3)) || (fodgkodf.contains(
                1
            ) && fodgkodf.contains(4) && fodgkodf.contains(7)) ||
            (fodgkodf.contains(3) && fodgkodf.contains(6) && fodgkodf.contains(9)) || (fodgkodf.contains(
                7
            ) && fodgkodf.contains(8) && fodgkodf.contains(9)) ||
            (fodgkodf.contains(4) && fodgkodf.contains(5) && fodgkodf.contains(6)) || (fodgkodf.contains(
                1
            ) && fodgkodf.contains(5) && fodgkodf.contains(9)) ||
            fodgkodf.contains(3) && fodgkodf.contains(5) && fodgkodf.contains(7) || (fodgkodf.contains(2) && fodgkodf.contains(
                5
            ) && fodgkodf.contains(8))
        ) {
            ovbjivb += 1

            fokdokgokdfo()

            startActivity(Intent(this@Nosospadjiws, Cososidwdji::class.java))
            return 1
        } else if (cijxvjixvci.contains(1) && cijxvjixvci.contains(2) && cijxvjixvci.contains(3) && cijxvjixvci.contains(
                4
            ) && cijxvjixvci.contains(5) && cijxvjixvci.contains(6) && cijxvjixvci.contains(7) &&
            cijxvjixvci.contains(8) && cijxvjixvci.contains(9)
        ) {
            startActivity(Intent(this@Nosospadjiws, Cososidwdji::class.java))
            return 1

        }
        return 0
    }
}