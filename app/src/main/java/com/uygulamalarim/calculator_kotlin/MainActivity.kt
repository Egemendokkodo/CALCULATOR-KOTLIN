package com.uygulamalarim.calculator_kotlin

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
import javax.script.ScriptException

open class MainActivity : AppCompatActivity() {
    var check=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonFunctions()

    }
    @SuppressLint("SetTextI18n")
    // this method will be adding elements on answer textview
    private fun buttonFunctions(){
        buttonOne.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+1.toInt()
        })
        buttonTwo.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+2.toInt()
        })
        buttonThree.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+3.toInt()
        })
        buttonFour.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+4.toInt()
        })
        buttonFive.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+5.toInt()
        })
        buttonSix.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+6.toInt()
        })
        buttonSeven.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+7.toInt()
        })
        buttonEight.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+8.toInt()
        })
        buttonNine.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+9.toInt()
        })
        buttonZero.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+0.toInt()
        })
        buttonDivide.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+"/"
        })
        buttonMultiply.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+"*"
        })
        buttonPlus.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+"+"
        })
        buttonMinus.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+"-"
        })
        buttonPercent.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+"%"
        })
        buttonDot.setOnClickListener(View.OnClickListener {
            var current=answer.text.toString()
            answer.text=current+"."
        })
        buttonDelete.setOnClickListener(View.OnClickListener {
            answer.text=answer.text.dropLast(1)
        })
        buttonDelete.setOnLongClickListener(View.OnLongClickListener {
            answer.text=""
            true
        })
        buttonEquals.setOnClickListener(View.OnClickListener {
            operations(answer.text.toString())
        })

    }
    // this function will execute four mode operations
    fun operations(text:String){
        val engine:ScriptEngine=ScriptEngineManager().getEngineByName("rhino")
        try {
            val result:Any=engine.eval(text)
            var mainr=result.toString()
            if (true)
                oldIslem.setText(text)
                answer.setText(mainr)
        }catch (e:ScriptException){
            Log.d(TAG, "operations: ERROR")
        }
    }

}