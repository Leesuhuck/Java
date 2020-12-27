package com.example.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sub2_Activity extends AppCompatActivity {

    private TextView text_end_I_p, text_end_R_p,text_theorem_I_R_p;

    String Max_ful_p, Max_ful2_p, value_p_1, value_p_2, Max_value, str, btr, ctr;

    double inte_mmoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2_);
        text_end_I_p = findViewById(R.id.text_end_I_p);
        text_end_R_p = findViewById(R.id.text_end_R_p);
        text_theorem_I_R_p = findViewById(R.id.text_theorem_I_R_p);

        Intent intent3 = getIntent(); // intent3 저장값 가져오기

        value_p_1 = intent3.getStringExtra("value_p_1"); // 사용자 이자 값 수식 결과 가져오기
        value_p_2 = intent3.getStringExtra("value_p_2"); // 사용자 이자 값 수식 결과 가져오기

        //Max_value = intent3.getStringExtra("Max_ful_p"); // 사용자 이자 값 수식 결과 가져오기

        text_end_I_p.setText(String.valueOf(value_p_1)); // 원금 이자 결과 화면에 적용
        text_end_R_p.setText(String.valueOf(value_p_2)); // 원금 이자 결과 화면에 적용


        str = intent3.getStringExtra("str"); // 사용자 원하는 str 입력값
        btr = intent3.getStringExtra("btr"); // 사용자 원하는 btr 입력값
        ctr = intent3.getStringExtra("ctr"); // 사용자 원하는 ctr 입력값


        // for 문으로 text_thorem_i_R_P 출력하기*
        double inter = Double.valueOf(btr).doubleValue() / 100; //btr
        double mmoney = Double.valueOf(str).doubleValue() / Double.valueOf(ctr).doubleValue(); //str ctr
        double inte = 0, sum = 0;

        double ex_str = Double.valueOf(str).doubleValue();
        double ex_ctr = Double.valueOf(ctr).doubleValue();

        text_theorem_I_R_p.setText("실행\n");

        for (int i = 1; i < ((int)ex_ctr + 1); i++) { //ctr
            inte = ex_str * (int)inter / (int)ex_ctr; //str ctr

            if (i < 10) {
                inte_mmoney = inte + mmoney;
                Max_ful_p = ("0"+ i +"번째 달 상환 금액 : " + (int)inte_mmoney + "원 \n");
                text_theorem_I_R_p.append(Max_ful_p); //텍스트 덧붙이기
                Max_ful2_p = ("> 이자비용 : "+ inte +"원, 상환금액 : " + (int)mmoney + "원 \n");
                text_theorem_I_R_p.append(Max_ful2_p);
            }
            else {
                Max_ful_p = ("0"+ i +"번째 달 상환 금액 : "+ (int)inte_mmoney + "원 \n");
                text_theorem_I_R_p.append(Max_ful_p);
                Max_ful2_p = ("> 이자비용 : "+ inte +"원, 상환금액 : " + (int)mmoney + "원 \n");
                text_theorem_I_R_p.append(Max_ful2_p);
            }
            ex_str -= mmoney; //str
            sum += inte;
        };

    }
}