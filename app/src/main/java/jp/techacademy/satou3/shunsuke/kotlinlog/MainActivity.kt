package jp.techacademy.satou3.shunsuke.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   val say = Human("shunsukesatou3",32,"スマホアプリ作成")

        say.say()


   val hobby = Human("shunsukesatou3",32, "スマホアプリ作成")

        hobby.think()

    }
}
