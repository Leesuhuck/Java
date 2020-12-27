package com.example.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sub4_Activity extends AppCompatActivity {

    private TextView text_end_I_m, text_end_R_m,text_theorem_I_R_m;

    String Max_ful_m, Max_ful2_m, str, btr, ctr, value_p_1, value_p_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4_);
        text_end_I_m = findViewById(R.id.text_end_I_m);
        text_end_R_m = findViewById(R.id.text_end_R_m);
        text_theorem_I_R_m = findViewById(R.id.text_theorem_I_R_m);

        Intent intent5 = getIntent(); // intent5 저장값 가져오기

        str = intent5.getStringExtra("str"); // 사용자 원하는 str 입력값
        btr = intent5.getStringExtra("btr"); // 사용자 원하는 btr 입력값
        ctr = intent5.getStringExtra("ctr"); // 사용자 원하는 ctr 입력값

        value_p_1 = intent5.getStringExtra("value_p_1"); // 사용자 이자 값 수식 결과 가져오기
        value_p_2 = intent5.getStringExtra("value_p_2"); // 사용자 이자 값 수식 결과 가져오기

        text_end_I_m.setText(String.valueOf(value_p_1)); // 원금 이자 결과 화면에 적용
        text_end_R_m.setText(String.valueOf(value_p_2)); // 원금 이자 결과 화면에 적용

        double inter = Double.valueOf(btr).doubleValue() / 100; //btr
        double inte = Double.valueOf(str).doubleValue() * inter / 12; //str
        int minte = (int)inte;

        int sum = 0;

        double ex_str = Double.valueOf(str).doubleValue();
        double ex_ctr = Double.valueOf(ctr).doubleValue();

        text_theorem_I_R_m.setText("실행\n");

        for (int i = 1; i < (int)ex_ctr; i++) {
            if (i < 10) {
                Max_ful_m = (i +"번째 달 상환 금액 : "+ minte +"원 \n");
                text_theorem_I_R_m.append(Max_ful_m);
                Max_ful2_m = ("> 이자비용 : "+ minte +"원, 상환금액 : 0원 \n");
                text_theorem_I_R_m.append(Max_ful2_m);
            }
            else {
                Max_ful_m = (i+"번째 달 상환 금액 : "+ minte +"원 \n");
                text_theorem_I_R_m.append(Max_ful_m);
                Max_ful2_m = ("> 이자비용 : "+ minte +"원, 상환금액 : 0원 \n");
                text_theorem_I_R_m.append(Max_ful2_m);
            }
            sum += minte;
        }
        int minte_money = (int)(minte + ex_ctr);
        Max_ful_m = (ex_ctr+"번째 달 상환 금액 : "+ minte_money +"원 \n"); //ctr ctr
        text_theorem_I_R_m.append(Max_ful_m);
        Max_ful2_m = ("> 이자비용 : "+ minte +"원, 상환금액 : "+ ex_ctr +"원 \n"); //ctr
        text_theorem_I_R_m.append(Max_ful2_m);

        sum += minte;

    }
}