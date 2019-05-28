package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    // Do it! 안드로이드 앱 onclick 버튼 예제4
    /* public void onBackClicked(View v) {
         finish();
     }*/

    // kotlin onclick 버튼 예제4
    fun onBackClicked(view: View) {
        finish()
    }
}
