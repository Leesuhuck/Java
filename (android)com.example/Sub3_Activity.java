package com.example.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static java.lang.Math.pow;
import static java.lang.Math.round;

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

        double inter = Double.valueOf(btr).doubleValue() / 100; //btr

        double first = Double.valueOf(str).doubleValue(); //str

        double son_f = Double.valueOf(str).doubleValue() * (inter / 12); //str
        double son_d = pow(1 + (inter / 12), Double.valueOf(str).doubleValue()); //str
        double mother = pow(1 + (inter / 12), Double.valueOf(str).doubleValue()); //str
        mother = mother - 1;

        double princ = round(son_f * son_d / mother);
        double inte = 0;
        double sum = 0, mmoney = 0;
        double ex_str = Double.valueOf(str).doubleValue();
        for (int i = 1; i < (Double.valueOf(ctr).doubleValue() + 1); i++) { //ctr
            inte = round(ex_str * inter / Double.valueOf(ctr).doubleValue()); //str, ctr
            mmoney = princ - inte;

            if (i < 10) {

                Max_ful_w[i]=("0"+ i +"번째 달 상환 금액 : "+ princ +"원 \n");
                Max_ful2_w[i]=("> 이자비용 : "+ (int)inte +"원, 상환금액 : "+ mmoney +"원 \n");
                intent4.putExtra("Max_ful", Max_ful_w[i]);//원리금 총합 값 저장
                intent4.putExtra("Max_ful", Max_ful2_w[i]);
            }
            else {
                Max_ful_w[i]=("0"+ i +"번째 달 상환 금액 : "+ princ +"원 \n");
                Max_ful2_w[i]=("> 이자비용 : "+ (int)inte +"원, 상환금액 : "+ mmoney +"원 \n");
                intent4.putExtra("Max_ful_w", Max_ful_w[i]);//원리금 총합 값 저장
                intent4.putExtra("Max_ful2_w", Max_ful2_w[i]);
            }

            ex_str -= mmoney; //str
            sum += inte;
        }
    }
}