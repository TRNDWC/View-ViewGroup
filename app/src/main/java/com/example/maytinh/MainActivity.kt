package com.example.maytinh

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    private var tvInput : TextView? = null
    private var preOperator: Int = 1
    var isNum : Boolean= true
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvInput= findViewById(R.id.tvId)
    }

    private fun format(s: String): String {
        return if (s.contains(".")) {
            var ans=s
            while (ans[ans.length-1]=='0') ans=ans.substring(0,s.length-1)
            if (ans[ans.length-1]=='.') ans=ans.substring(0,s.length-2)
            ans
        } else {
            var s1=s.toDouble()
            var s2=s.toInt()
            val ans = if (s1-s2==0.0) s.toInt().toString() else s.toDouble().toString()
            ans
        }
    }
    fun onClick(view: View){
        if (isNum==false) tvInput?.text="0"
        tvInput?.append((view as Button).text)
        tvInput?.text=format((tvInput?.text.toString()))
        isNum = true
    }
    fun onClear(view : View) {
        tvInput?.let{
            tvInput?.text="0"
        }
        num1=0.0
        num2=0.0
        preOperator=1
        isNum=true
    }

    fun onPm(view: View) {
        tvInput?.let{
            val str: String= tvInput?.text.toString()
            var gt= str.toDouble()
            gt = if (gt<0) abs(gt)
            else -gt
            tvInput?.text=format(gt.toString())
        }
    }

    fun onPercent(view: View) {
        tvInput?.let{
            var gt=tvInput?.text.toString().toDouble()
            gt/=100
            tvInput?.text=format(gt.toString())
        }
    }

    fun onDot(view: View){
        if ("." in tvInput?.text.toString())
            else tvInput?.append(".")
    }

    fun get (s:String) :Int{
        return when (s) {
            "+" -> return 1
            "-" -> return 2
            "x" -> return 3
            else -> 4
        }
    }
    fun onOperator(view: View){
        val gt=tvInput?.text.toString().toDouble()
        if (isNum==true){
            when (preOperator){
                1 -> num1+=gt
                2 -> num1-=gt
                3 -> num1*=gt
                4 -> if (gt!=0.0) num1/=gt
            }
            tvInput?.text=format(num1.toString())
            if (gt==0.0&&preOperator==4) tvInput?.text="Error"
        }
        preOperator=get((view as Button).text.toString())
        isNum=false
    }

    fun onEqual(view: View){
        if (preOperator!=0){
            val gt=tvInput?.text.toString().toDouble()
                when (preOperator){
                    1 -> num1+=gt
                    2 -> num1-=gt
                    3 -> num1*=gt
                    4 -> if (gt!=0.0) num1=num1/gt else tvInput?.text="Error"
                }
            if (preOperator==4&&gt==0.0)
                else tvInput?.text=format(num1.toString())
        }
        preOperator=1
        num1=0.0
        isNum=true
    }
}