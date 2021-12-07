package com.example.mobilefinal00

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.AdapterView.OnItemLongClickListener
import androidx.appcompat.app.AppCompatActivity



class AddInfoActivity : AppCompatActivity() {

    var list:ListView? = null
    var adapter: ArrayAdapter<String>? = null
    var midList: ArrayList<String>? = null
    var edtItem: EditText? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addinfo_activity)

        val midList = ArrayList<String>()
        val list:ListView = findViewById(R.id.nameList)
        val adapter = MyCustomAdapter1(this,midList)

        list.adapter = adapter

        val edtItem:EditText = findViewById(R.id.addMovieName)
        val btnAdd:Button = findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
            midList.add(edtItem.text.toString())
            val adapter = MyCustomAdapter1(this,midList)
            list.adapter = adapter
            adapter!!.notifyDataSetChanged()
        }
    }
    private class MyCustomAdapter1(context: Context, data : ArrayList<String>) : BaseAdapter() {
        private val mContext: Context
        private var mData  = ArrayList<String>()

        //데이터 어레이
        init {
            mContext = context
            mData = data
        }
        override fun getCount(): Int {
            return mData.size

        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }
        override fun getItem(position: Int): Any {
            val selectItem = mData.get(position)
            return selectItem
        }
        override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.addinfo_row, viewGroup, false)

            val nameTextView = rowMain.findViewById<TextView>(R.id.info_textview)
            nameTextView.text = mData.get(position)

            return rowMain
        }
    }
}
