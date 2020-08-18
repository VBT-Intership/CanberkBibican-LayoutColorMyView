package com.canberkbbc.layouts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.canberkbbc.layouts.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    //private val myName : MyName = MyName("Canberk Bibican")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //binding.myName=myName

        setListeners()

    }
    private fun setListeners(){
        val clickableView: List<View> = listOf(txt_box,textView2,textView3,textView4,textView5,button,button2,button3)
        for (item in clickableView)item.setOnClickListener{makeColored(it)}
    }

    fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for background
            R.id.txt_box -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textView2 -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.textView3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.textView4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.textView5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.button -> textView3.setBackgroundResource(R.color.colorRed)
            R.id.button2-> textView4.setBackgroundResource(R.color.colorYellow)
            R.id.button3-> textView5.setBackgroundResource(R.color.colorGreen)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}