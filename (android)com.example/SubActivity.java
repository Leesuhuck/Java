package com.example.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class SubActivity extends AppCompatActivity {

    private TextView text_I_p, text_R_p, text_I_w, text_R_w, text_I_m, text_R_m;

    Button btn_p, btn_w, btn_m;

    double ful, inte_mmoney; //이름 다시 지정하기

    String Max_ful; // 이름 다시 지정하기

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        text_I_p = findViewById(R.id.text_interest_principal); // 원금 이자비용
        text_R_p = findViewById(R.id.text_Repayment_principal); // 원금 상환금액
        text_I_w = findViewById(R.id.text_interest_wonligeum); // 원리금 이자비용
        text_R_w = findViewById(R.id.text_Repayment_wonligeum); // 원리금 상환금액
        text_I_m = findViewById(R.id.text_interest_maturity); // 만기 이자비용
        text_R_m = findViewById(R.id.text_Repayment_maturity); // 만기 상환금액

        btn_p = findViewById(R.id.btn_principal); // 원금 버튼
        btn_w = findViewById(R.id.btn_wonligeum); // 원리금 버튼
        btn_m = findViewById(R.id.btn_maturity); // 만기 버튼

        Intent intent2 = getIntent(); // intent2 저장값 가져오기

        String str, btr, ctr, value_p_1, value_p_2, value_w_1, value_w_2, value_m_1, value_m_2; //문자열 지정

        value_p_1 = intent2.getStringExtra("Map_p_1"); // 사용자 이자 값 수식 결과 가져오기
        value_p_2 = intent2.getStringExtra("Map_p_2"); // 사용자 이자 값 수식 결과 가져오기
        value_w_1 = intent2.getStringExtra("Map_w_1"); // 사용자 이자 값 수식 결과 가져오기
        value_w_2 = intent2.getStringExtra("Map_w_2"); // 사용자 이자 값 수식 결과 가져오기
        value_m_1 = intent2.getStringExtra("Map_m_1"); // 사용자 이자 값 수식 결과 가져오기
        value_m_2 = intent2.getStringExtra("Map_m_2"); // 사용자 이자 값 수식 결과 가져오기

        str = intent2.getStringExtra("str"); // 사용자 원하는 str 입력값
        btr = intent2.getStringExtra("btr"); // 사용자 원하는 btr 입력값
        ctr = intent2.getStringExtra("ctr"); // 사용자 원하는 ctr 입력값


        text_I_p.setText(String.valueOf(value_p_1)); // 원금 이자 결과 화면에 적용
        text_R_p.setText(String.valueOf(value_p_2)); // 원금 상환 결과 화면에 적용
        text_I_w.setText(String.valueOf(value_w_1)); // 원리금 이자 결과 화면에 적용
        text_R_w.setText(String.valueOf(value_w_2)); // 원리금 상환 결과 화면에 적용
        text_I_m.setText(String.valueOf(value_m_1)); // 만기 원금 이자 결과 화면에 적용
        text_R_m.setText(String.valueOf(value_m_2)); // 만기 원금 상환 결과 화면에 적용


        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(SubActivity.this, Sub2_Activity.class); //총 원금 이동경로
                // 원금 총합 이자 상환 금액식 추가
                Max_ful = String.valueOf(ful);

                double inter = Double.valueOf(btr).doubleValue() / 100; //btr
                double mmoney = Double.valueOf(str).doubleValue() / Double.valueOf(ctr).doubleValue(); //str ctr
                double inte = 0, sum = 0;
                double ex_str = Double.valueOf(str).doubleValue();
                for (int i = 1; i < (Double.valueOf(ctr).doubleValue() + 1); i++) { //ctr
                    inte = ex_str * (int)inter / Double.valueOf(ctr).doubleValue(); //str ctr

                    if (i < 10) {
                        inte_mmoney=inte + mmoney;
                        Max_ful=("0"+ i +"번째 달 상환 금액 : "+ inte_mmoney +"원 \n");
                        Max_ful=("> 이자비용 : "+ inte +"원, 상환금액 : "+ mmoney +"원 \n");
                        intent3.putExtra("Max_ful", Max_ful); //원금 총합 값 저장
                    }
                    else {
                        Max_ful=("0"+ i +"번째 달 상환 금액 : "+ inte_mmoney +"원 \n");
                        Max_ful=("> 이자비용 : "+ inte +"원, 상환금액 : "+ mmoney +"원 \n");
                        intent3.putExtra("Max_ful", Max_ful); //원금 총합 값 저장
                    }
                    ex_str -= mmoney; //str
                    sum += inte;
                };
                // ful = Double.valueOf(str).doubleValue() + Double.valueOf(btr).doubleValue() + Double.valueOf(ctr).doubleValue(); // 원금 총합 식 입력할것.
                startActivity(intent3);
            }
        });

        btn_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(SubActivity.this, Sub3_Activity.class); //총 원리금 이동경로
                // 원리금 총합 이자 상환 금액 추가
                Max_ful = String.valueOf(ful);

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

                        Max_ful=("0"+ i +"번째 달 상환 금액 : "+ princ +"원 \n");
                        Max_ful=("> 이자비용 : "+ (int)inte +"원, 상환금액 : "+ mmoney +"원 \n");
                        intent4.putExtra("Max_ful", Max_ful);//원리금 총합 값 저장
                    }
                    else {
                        Max_ful=("0"+ i +"번째 달 상환 금액 : "+ princ +"원 \n");
                        Max_ful=("> 이자비용 : "+ (int)inte +"원, 상환금액 : "+ mmoney +"원 \n");
                        intent4.putExtra("Max_ful", Max_ful);//원리금 총합 값 저장
                    }

                    ex_str -= mmoney; //str
                    sum += inte;
                }
                // ful = Double.valueOf(str).doubleValue() + Double.valueOf(btr).doubleValue() + Double.valueOf(ctr).doubleValue(); // 원리금 총합 식 입력할것.

                startActivity(intent4);
            }
        });

        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(SubActivity.this, Sub4_Activity.class); //총 만기 이동경로
                // 만기금 총합 이자 상환 금액 추가
                double inter = Double.valueOf(btr).doubleValue() / 100; //btr
                double inte = Double.valueOf(str).doubleValue() * inter / 12; //str
                int minte = (int)inte;

                int sum = 0;
                double ex_str = Double.valueOf(str).doubleValue();
                for (int i = 1; i < ex_str; i++) {
                    if (i < 10) {
                        Max_ful=(i +"번째 달 상환 금액 : "+ minte +"원 \n");
                        Max_ful=("> 이자비용 : "+ minte +"원, 상환금액 : 0원 \n");
                        intent5.putExtra("Max_ful", Max_ful);//만리금 총합 값 저장
                    }
                    else {
                        Max_ful=(i+"번째 달 상환 금액 : "+ minte +"원 \n");
                        Max_ful=("> 이자비용 : "+ minte +"원, 상환금액 : 0원 \n");
                        intent5.putExtra("Max_ful", Max_ful);//만리금 총합 값 저장
                    }
                    sum += minte;
                }
                int minte_money = (int)(minte + Double.valueOf(ctr).doubleValue());
                Max_ful=("--------------------------------------------------\n");
                Max_ful=(Double.valueOf(ctr).doubleValue()+"번째 달 상환 금액 : "+ minte_money +"원 \n"); //ctr ctr
                Max_ful=("> 이자비용 : "+ minte +"원, 상환금액 : "+ Double.valueOf(ctr).doubleValue() +"원 \n"); //ctr

                sum += minte;

                //ful = Double.valueOf(str).doubleValue() + Double.valueOf(btr).doubleValue() + Double.valueOf(ctr).doubleValue(); // 만리금 총합 식 입력할것.
                Max_ful = String.valueOf(ful);

                startActivity(intent5);
            }
        });


    }
}