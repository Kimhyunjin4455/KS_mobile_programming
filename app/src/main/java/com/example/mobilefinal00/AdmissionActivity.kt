package com.example.mobilefinal00


import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AdmissionActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.admission_activity)

        val MovieAdm : ImageButton = findViewById(R.id.cgvImage)

        MovieAdm.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("CGV")
            builder.setMessage("성인:13000(14000)\n청소년:10000(11000)\n( )안의 내용은 주말(금~일)가격입니다.\n위 가격은 일반시간대 기준이며 오전 시간대에는 다른 금액이 적용됩니다(최대 4천원 할인)")
            builder.setPositiveButton("확인", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            // 다이얼로그를 띄워주기
            builder.create()
            builder.show()
        })

        val MovieAdm2 : ImageButton = findViewById(R.id.lotteImage)

        MovieAdm2.setOnClickListener({
            val builder = AlertDialog.Builder(this)
            builder.setTitle("LotteCINEMA")
            builder.setMessage("성인:13000(14000)\n청소년:10000(11000)\n시니어(실버):7000\n( )안의 내용은 주말(금~일)가격입니다.\n위 가격은 일반시간대 기준이며 오전 시간대에는 다른 금액이 적용됩니다(최대 4천원 할인)")
            builder.setPositiveButton("확인", object : DialogInterface.OnClickListener {

                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.d("MyTag", "positive")
                }
            })

            builder.create()
            builder.show()
        })

        val MovieAdm3 : ImageButton = findViewById(R.id.megaImage)

            MovieAdm3.setOnClickListener({
                val builder = AlertDialog.Builder(this)
                builder.setTitle("MEGABOX")
                builder.setMessage("지점별로 차이가 있으며\n평일 일반 기준 12000~13000.\n평일 청소년 기준 10000~11000\n주말 일반 기준 13000~14000\n주말 청소년 기준10000~11000\n*오전 할인은 별도 입니다.*")
                builder.setPositiveButton("확인", object : DialogInterface.OnClickListener{

                    override fun onClick(dialog: DialogInterface, which: Int) {
                        Log.d("MyTag", "positive")
                    }
                })

                builder.create()
                builder.show()

            })
    }
}