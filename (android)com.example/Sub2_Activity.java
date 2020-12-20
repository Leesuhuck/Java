package com.example.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sub2_Activity extends AppCompatActivity {

    private TextView text_end_I_p, text_end_R_p,text_theorem_I_R_p;

    String Max_ful;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2_);
        text_end_I_p = findViewById(R.id.text_end_I_p);
        text_end_R_p = findViewById(R.id.text_end_R_p);
        text_theorem_I_R_p = findViewById(R.id.text_theorem_I_R_p);

        Intent intent3 = getIntent(); // intent3 저장값 가져오기

        Max_ful = intent3.getStringExtra("Max_ful"); // 사용자 이자 값 수식 결과 가져오기

        text_end_I_p.setText(String.valueOf(Max_ful)); // 원금 이자 결과 화면에 적용

    }
}