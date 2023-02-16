package com.miHoYo.Gens.dwisuhdws

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.miHoYo.Gens.bgdsseu.Opwuiuhshudhuw
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.lsoakdoasok
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.wpwwqpsoaodkokasd
import com.miHoYo.Gens.bgdsseu.Polsoiwjijisjid.ogkfkojifgi
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


class Wusisjjisd : AppCompatActivity() {
    private var guthujifijg: ValueCallback<Array<Uri>>? = null
    private  val qoosijdjai = 1
    private var kxkizocksjiajcias = false
    lateinit var oicvjiibjivj: WebView
    var rokekokoer = ""
    private var ydtstsdf: String? = null
    private val nxcijiasuhusa by viewModel<Opwuiuhshudhuw>(
        named("BeamModel")
    )





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oicvjiibjivj = WebView(this)
        setContentView(oicvjiibjivj)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(oicvjiibjivj, true)
        nxcijiasuhusa.dokkocjivj(oicvjiibjivj)

        oicvjiibjivj.webViewClient = Rwoskdijjixjic()
        oicvjiibjivj.webChromeClient = Qisuuhdhuahud()
        oicvjiibjivj.loadUrl(bnokbnkobnjijifdjig())
    }


    inner class Rwoskdijjixjic: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (nxcijiasuhusa.ookokokdjisjif(url)) {

                    val fiodookckoxokvij = Intent(Intent.ACTION_VIEW)
                    fiodookckoxokvij.data = Uri.parse(url)
                    startActivity(fiodookckoxokvij)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            bbvchuchuhud(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Wusisjjisd, description, Toast.LENGTH_SHORT).show()
        }
    }
    override fun onBackPressed() {

        if (oicvjiibjivj.canGoBack()) {
            if (kxkizocksjiajcias) {
                oicvjiibjivj.stopLoading()
                oicvjiibjivj.loadUrl(rokekokoer)
            }
            this.kxkizocksjiajcias = true
            oicvjiibjivj.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                kxkizocksjiajcias = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }





    private fun bnokbnkobnjijifdjig(): String {

        val reokdkoskofsdji = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val xkxkcixzjjjias = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val osapdlokwokd = xkxkcixzjjjias.getString(wpwwqpsoaodkokasd, null)

        val nmvcmvbcuhbhuf = xkxkcixzjjjias.getString(ogkfkojifgi, null)
        val eiosokosdk = xkxkcixzjjjias.getString(lsoakdoasok, null)


        when (xkxkcixzjjjias.getString("WebInt", null)) {
            "campaign" -> {
                nxcijiasuhusa.rokekokodf(eiosokosdk.toString())
            }
            "deepLink" -> {
                nxcijiasuhusa.rokekokodf(eiosokosdk.toString())
            }
            "deepLinkNOApps" -> {
                nxcijiasuhusa.rokekokodf(nmvcmvbcuhbhuf.toString())
            }
            "geo" -> {
                nxcijiasuhusa.rokekokodf(nmvcmvbcuhbhuf.toString())
            }
        }
        return reokdkoskofsdji.getString("SAVED_URL", osapdlokwokd).toString()
    }

    override fun onActivityResult(oeokodkof: Int, obokov: Int, iushdhuwhu: Intent?) {

        if (oeokodkof != qoosijdjai || guthujifijg == null) {
            super.onActivityResult(oeokodkof, obokov, iushdhuwhu)
            return
        }
        var hhfydjjfdi: Array<Uri>? = null

        if (obokov == RESULT_OK) {
            if (iushdhuwhu == null) {
                if (ydtstsdf != null) {
                    hhfydjjfdi = arrayOf(Uri.parse(ydtstsdf))
                }
            } else {
                val doeooiijjidsa = iushdhuwhu.dataString
                if (doeooiijjidsa != null) {
                    hhfydjjfdi = arrayOf(Uri.parse(doeooiijjidsa))
                }
            }
        }
        guthujifijg!!.onReceiveValue(hhfydjjfdi)
        guthujifijg = null
        return
    }


    fun bbvchuchuhud(oqokkwoe: String?) {
        if (!oqokkwoe!!.contains("t.me")) {

            if (rokekokoer == "") {
                rokekokoer = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    oqokkwoe
                ).toString()

                val gokfkogfk = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val tstrsaygdasjia = gokfkogfk.edit()
                tstrsaygdasjia.putString("SAVED_URL", oqokkwoe)
                tstrsaygdasjia.apply()
            }
        }
    }



    inner class Qisuuhdhuahud : WebChromeClient() {

        override fun onShowFileChooser(
            gokfo: WebView?,
            idudhu: ValueCallback<Array<Uri>>?,
            viocjijicv: FileChooserParams?
        ): Boolean {
            guthujifijg?.onReceiveValue(null)
            guthujifijg = idudhu
            var ooposdkosdako: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (ooposdkosdako!!.resolveActivity(packageManager) != null) {
                var riuhdshfhu: File? = null
                try {
                    riuhdshfhu = forookokfkodkg()
                    ooposdkosdako.putExtra("PhotoPath", ydtstsdf)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (riuhdshfhu != null) {
                    ydtstsdf = "file:" + riuhdshfhu.absolutePath
                    ooposdkosdako.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(riuhdshfhu)
                    )
                } else {
                    ooposdkosdako = null
                }
            }
            val jcjixvhuhuvchu = Intent(Intent.ACTION_GET_CONTENT)
            jcjixvhuhuvchu.addCategory(Intent.CATEGORY_OPENABLE)
            jcjixvhuhuvchu.type = "image/*"
            val fijdjirij: Array<Intent?> = ooposdkosdako?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val oowowoowksijdjias = Intent(Intent.ACTION_CHOOSER)
            oowowoowksijdjias.putExtra(Intent.EXTRA_INTENT, jcjixvhuhuvchu)
            oowowoowksijdjias.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            oowowoowksijdjias.putExtra(Intent.EXTRA_INITIAL_INTENTS, fijdjirij)
            startActivityForResult(oowowoowksijdjias, qoosijdjai)
            return true
        }

        fun forookokfkodkg(): File? {
            val xozkoc = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val tsydusjiadasd = "JPEG_" + xozkoc + "_"
            val mxkzockiajjias = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                tsydusjiadasd,
                ".jpg",
                mxkzockiajjias
            )
        }
    }


}

