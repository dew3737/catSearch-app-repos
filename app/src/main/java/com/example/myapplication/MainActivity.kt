package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val 의 경우 한번 할당하면 변경할 수 있으며 타입 선언 없이 바로 값 할당이 가능하다.
        // var의 경우 수정 가능한 변수를 선언한다.
        // nullabel한 변수는 Type에 물음표를 선언한다. 예) var adress: String? = null

        // get reference to btn
        val btn_click_me = findViewById<Button>(R.id.btn_click_me)

        // set on-click listener
        btn_click_me.setOnClickListener {
            Toast.makeText(this, "람다식 구현 버튼 클릭!", Toast.LENGTH_SHORT).show()
        }
    }

    // Do it! 안드로이드 앱 onclick 버튼 예제1
    /*public void onButton1Clicked(View v) {
        Toast.makeText(applicationContext(), text "버튼이 눌렸어요!", Toast.LENGTH_LONG).show(); // text 입력 시 duration 자동 생성
    }*/

    // kotlin onclick 버튼 예제1
    fun onButton1Clicked(view: View) {
        // 토스트 기본 문법 Toast.makeText(Context, String(사용자에게 보여줄 내용), Int(화면에 표시될 시간/short 2초정도/long 5초정도)).show();
        Toast.makeText(this, "버튼이 눌렸어요!", Toast.LENGTH_LONG).show()
    }

    // Do it! 안드로이드 앱 onclick 버튼 예제2
    /*public void onButton2Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }*/

    // kotlin onclick 버튼 예제2
    fun onButten2Clicked(view: View) {
        val nextIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
        startActivity(nextIntent)
    }

    // Do it! 안드로이드 앱 onclick 버튼 예제3
    /*public void onButton3Clicked(View v) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }*/

    // kotlin onclick 버튼 예제3
    fun onButton3Clicked(view: View) {
        val nextIntent = Intent(this, MenuActivity::class.java)
        startActivity(nextIntent)
    }
}
