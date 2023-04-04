package com.example.mobilefinal00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MovieInfo :TextView = findViewById(R.id.MovieInfo)

        MovieInfo.setOnClickListener({
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        })


        val DetailInfo : TextView = findViewById(R.id.DetailInfo)

        DetailInfo.setOnClickListener({
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        })

        val PopMovie : Button = findViewById(R.id.PopMovie)

        PopMovie.setOnClickListener({
            val intent = Intent(this,PopMovieActivity::class.java)
            startActivity(intent)
        })

        val AddInfo : TextView = findViewById(R.id.addMovieInfo)

        AddInfo.setOnClickListener({
            val intent = Intent(this,AddInfoActivity::class.java)
            startActivity(intent)
        })



    }

    fun onDialogBtnClicked(view: View){
        val explaDialog = ExplaActivity(this)
        explaDialog.show()
    }

    fun onDialogBtnClicked2(view: View){
        val explaDialog2 = MyInfoActivity(this)
        explaDialog2.show()
    }
}