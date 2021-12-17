package com.example.plannerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.plannerproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //액티비티 바인딩 객체 할당 및 뷰 설정
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);

        //페이지 이동 인텐트 정의
        Intent goPageList_intent = new Intent(MainActivity.this, Main3PageList.class);

        //페이지 이동 온클릭 이벤트
        mainBinding.btnGoPageList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(goPageList_intent);}
        });

    }


}