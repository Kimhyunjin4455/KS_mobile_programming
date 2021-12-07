package com.example.mobilefinal00


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)



        val listView = findViewById<ListView>(R.id.listview)

//        어답터 설정
        listView.adapter = MyCustomAdapter(this)

//        Item click listener
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as String

            Toast.makeText(this, selectItem, Toast.LENGTH_SHORT).show()
        }
    }

    //    Adapter class
    private class MyCustomAdapter(context: Context) : BaseAdapter() {
        private val mContext: Context

        //데이터 어레이
        private val names = arrayListOf<String>(
                "이터널스", "강릉", "듄", "장르만 로맨스", "아담스 패밀리 2","귀멸의 칼날: 남매의 연","베놈 2:렛 데어 비 카니지","유체이탈자","디어 에반 헨슨","틱, 틱... 붐!"
        )

        init {
            mContext = context
        }
        override fun getCount(): Int {
            return names.size
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }
        override fun getItem(position: Int): Any {
            val selectItem = names.get(position)
            return selectItem
        }
        override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false)

            val nameTextView = rowMain.findViewById<TextView>(R.id.name_textview)
            nameTextView.text = names.get(position)
            val positionTextView = rowMain.findViewById<TextView>(R.id.position_textview)
            positionTextView.text = "예매 순위: " + (position+1)

            return rowMain
        }
    }
}