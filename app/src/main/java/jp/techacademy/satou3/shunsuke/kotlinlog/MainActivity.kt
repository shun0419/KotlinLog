package jp.techacademy.satou3.shunsuke.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)

       dog.say()
        Log.d("kotlintest", "犬の名前は"+ dog.name + "です")
        Log.d("kotlintest","犬の年齢は" + dog.age + "歳です。")


        val bigdog =BigDog("ヨーゼフ", 15)

        bigdog.say()
        Log.d("kotlintest","犬の名前は" + bigdog.name + "です")
        Log.d("kotlintest","犬の年齢は" + bigdog.age + "歳です。")



    }
}
