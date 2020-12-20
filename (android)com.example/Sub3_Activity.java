package com.example.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sub3_Activity extends AppCompatActivity {

    private TextView text_end_I_w, text_end_R_w,text_theorem_I_R_w;

    String Max_ful;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3_);
        text_end_I_w = findViewById(R.id.text_end_I_w);
        text_end_R_w = findViewById(R.id.text_end_R_w);
        text_theorem_I_R_w = findViewById(R.id.text_theorem_I_R_w);

        Intent intent4 = getIntent(); // intent4 저장값 가져오기

        Max_ful = intent4.getStringExtra("Max_ful"); // 사용자 이자 값 수식 결과 가져오기

        text_end_I_w.setText(String.valueOf(Max_ful)); // 원금 이자 결과 화면에 적용

    }
}