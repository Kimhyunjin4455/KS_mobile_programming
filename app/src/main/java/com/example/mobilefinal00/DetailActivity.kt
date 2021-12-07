package com.example.mobilefinal00


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class DetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val Admission: Button = findViewById(R.id.admission)

        Admission.setOnClickListener({
            val intent = Intent(this, AdmissionActivity::class.java)
            startActivity(intent)
        })

        val cgv_url: Button = findViewById(R.id.cgvUrl)

        cgv_url.setOnClickListener({
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cgv.co.kr/"))
            startActivity(intent)
        })

        val lotte_url: Button = findViewById(R.id.lotteUrl)

        lotte_url.setOnClickListener({
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lottecinema.co.kr/NLCHS"))
            startActivity(intent)
        })

        val mega_url: Button = findViewById(R.id.megaUrl)

        mega_url.setOnClickListener({
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.megabox.co.kr/"))
            startActivity(intent)
        })

        val ost_url: Button = findViewById(R.id.inOst)

        ost_url.setOnClickListener({
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=%EA%B5%AD%EB%82%B4%EC%98%81%ED%99%94+ost"))
            startActivity(intent)
        })

        val worldOst_url: Button = findViewById(R.id.worldOst)

        worldOst_url.setOnClickListener({
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=%EC%99%B8%EA%B5%AD%EC%98%81%ED%99%94+ost"))
            startActivity(intent)
        })

        val btnReturn: Button = findViewById(R.id.btnReturn)

        btnReturn.setOnClickListener({
            finish()
        })
    }
}