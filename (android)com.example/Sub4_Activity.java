package com.example.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sub4_Activity extends AppCompatActivity {

    private TextView text_end_I_m, text_end_R_m,text_theorem_I_R_m;

    String Max_ful;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4_);
        text_end_I_m = findViewById(R.id.text_end_I_m);
        text_end_R_m = findViewById(R.id.text_end_R_m);
        text_theorem_I_R_m = findViewById(R.id.text_theorem_I_R_m);

        Intent intent5 = getIntent(); // intent5 저장값 가져오기

        Max_ful = intent5.getStringExtra("Max_ful"); // 사용자 이자 값 수식 결과 가져오기

        text_end_I_m.setText(String.valueOf(Max_ful)); // 원금 이자 결과 화면에 적용

    }
}