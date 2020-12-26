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

        double inter = Double.valueOf(btr).doubleValue() / 100; //btr
        double inte = Double.valueOf(str).doubleValue() * inter / 12; //str
        int minte = (int)inte;

        int sum = 0;

        double ex_str = Double.valueOf(str).doubleValue();
        double ex_ctr = Double.valueOf(ctr).doubleValue();

        for (int i = 1; i < (int)ex_ctr; i++) {
            if (i < 10) {
                Max_ful_m[i]=(i +"번째 달 상환 금액 : "+ minte +"원 \n");
                Max_ful2_m[i]=("> 이자비용 : "+ minte +"원, 상환금액 : 0원 \n");
                intent5.putExtra("Max_ful_m", Max_ful_m[i]);//만리금 총합 값 저장
                intent5.putExtra("Max_ful2_m", Max_ful2_m[i]);
            }
            else {
                Max_ful_m[i]=(i+"번째 달 상환 금액 : "+ minte +"원 \n");
                Max_ful2_m[i]=("> 이자비용 : "+ minte +"원, 상환금액 : 0원 \n");
                intent5.putExtra("Max_ful", Max_ful_m[i]);//만리금 총합 값 저장
                intent5.putExtra("Max_ful", Max_ful2_m[i]);
            }
            sum += minte;
        }
        int minte_money = (int)(minte + Double.valueOf(ctr).doubleValue());
        Max_ful_m[(int)ex_ctr]=(Double.valueOf(ctr).doubleValue()+"번째 달 상환 금액 : "+ minte_money +"원 \n"); //ctr ctr
        Max_ful2_m[(int)ex_ctr]=("> 이자비용 : "+ minte +"원, 상환금액 : "+ Double.valueOf(ctr).doubleValue() +"원 \n"); //ctr

        sum += minte;

    }
}