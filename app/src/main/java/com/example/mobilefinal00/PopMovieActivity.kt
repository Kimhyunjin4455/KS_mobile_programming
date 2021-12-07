package com.example.mobilefinal00

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class PopMovieActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.month_activity)

        val Movie5 : Button = findViewById(R.id.button1)

        Movie5.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("5월의 영화")
            builder.setMessage("1위: 분노의 질주: 더 얼티메이트\n2위: 크루엘라\n3위: 비와 당신의 이야기")
            builder.setPositiveButton("닫기", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })

        val Movie6 : Button = findViewById(R.id.button2)

        Movie6.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("6월의 영화")
            builder.setMessage("1위: 크루엘라\n2위: 컨저링3: 악마가 시켰다\n3위: 콰이어트 플레이스2")
            builder.setPositiveButton("닫기", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })

        val Movie7 : Button = findViewById(R.id.button3)

        Movie7.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("7월의 영화")
            builder.setMessage("1위: 블랙 위도루\n2위: 랑종\n3위: 보스 베이비2")
            builder.setPositiveButton("닫기", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })

        val Movie8 : Button = findViewById(R.id.button4)

        Movie8.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("8월의 영화")
            builder.setMessage("1위: 모가디슈\n2위: 싱크홀\n3위: 인질")
            builder.setPositiveButton("닫기", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })

        val Movie9 : Button = findViewById(R.id.button5)

        Movie9.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("9월의 영화")
            builder.setMessage("1위: 샹치와 텐 링즈의 전설\n2위: 보이스\n3위: 기적")
            builder.setPositiveButton("닫기", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })

        val Movie10 : Button = findViewById(R.id.button6)

        Movie6.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("10월의 영화")
            builder.setMessage("1위: 베놈 2: 렛 데어 비 카니지\n2위: 007 노 타임 투 다이\n3위: 듄")
            builder.setPositiveButton("닫기", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })

        val Movie11 : Button = findViewById(R.id.button7)

        Movie11.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("11월의 영화")
            builder.setMessage("1위: 이터널스\n2위: 듄\n3위: 장르만 로맨스")
            builder.setPositiveButton("닫기", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })

        val Movie12 : Button = findViewById(R.id.button8)

        Movie12.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("12월의 기대작")
            builder.setMessage("스파이더맨: 노 웨이 홈")
            builder.setPositiveButton("닫기", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })
    }
}