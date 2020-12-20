package com.example.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class MainActivity extends AppCompatActivity {

    Button btn_text,btn_move;

    EditText text, text2, text3;

    String str, btr, ctr, Map_p_1, Map_p_2, Map_w_1, Map_w_2, Map_m_1, Map_m_2;

    double inte_mmoney_p ;

    int value_p_1, value_p_2, value_w_1, value_w_2, value_m_1, value_m_2;

    public void A(String str, String btr, String ctr){

        double inter_p = Double.valueOf(btr).doubleValue() / 100; //원금 공식
        int first_p = (int) (Double.valueOf(str).doubleValue()); //str
        double mmoney_p = Double.valueOf(str).doubleValue() / Double.valueOf(ctr).doubleValue(); //str ctr
        double inte_p = 0, sum_p = 0;
        int ex_str_p = (int) Double.valueOf(str).doubleValue();
        int ex_ctr_p = (int) Double.valueOf(ctr).doubleValue();
        for (int i = 1; i < (ex_ctr_p + 1); i++) { //ctr
            inte_p = ex_str_p * (int)inter_p / ex_ctr_p; //str ctr

            if (i < 10) {
                this.inte_mmoney_p=inte_p + mmoney_p;
            }
            else {

            }
            ex_str_p -= mmoney_p; //str
            sum_p += inte_p;
        };

        int total_p = (int)sum_p + first_p;

        value_p_1 = (int) sum_p;

        value_p_2 = total_p;
    }

    public void B(String str, String btr, String ctr){

        double inter_w = Double.valueOf(btr).doubleValue() / 100; //btr
        int first_w = (int) (Double.valueOf(str).doubleValue()); //str
        double son_f = Double.valueOf(str).doubleValue() * (inter_w / 12); //str
        double son_d = pow(1 + (inter_w / 12), Double.valueOf(str).doubleValue()); //str
        double mother = pow(1 + (inter_w / 12), Double.valueOf(str).doubleValue()); //str
        mother = mother - 1;

        int princ = (int) round(son_f * son_d / mother);
        double inte_w = 0;
        int sum_w = 0, mmoney_w = 0;
        double ex_str = Double.valueOf(str).doubleValue();
        for (int i = 1; i < (Double.valueOf(ctr).doubleValue() + 1); i++) { //ctr
            inte_w = round(ex_str * inter_w / Double.valueOf(ctr).doubleValue()); //str, ctr
            mmoney_w = princ - (int) inte_w;

            ex_str -= mmoney_w; //str
            sum_w += (int)inte_w;
        }

        int total_w = sum_w + first_w;

        value_w_1 = (int)sum_w;
        value_w_2 = total_w;



    }

    public void C(String str, String btr, String ctr) {

        double inter_m = Double.valueOf(btr).doubleValue() / 100; //btr
        double inte_m = Double.valueOf(str).doubleValue() * inter_m / 12; //str
        int minte = (int)inte_m;

        int sum_m = 0;
        double ex_str_m = Double.valueOf(str).doubleValue();
        for (int i = 1; i < ex_str_m; i++) {
            sum_m += minte;
        }
        int total_m = (int)(minte + Double.valueOf(ctr).doubleValue());

        sum_m += minte;
        value_m_1 = sum_m;
        value_m_2 = total_m;

    }

    //return 적용
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        btn_text = findViewById(R.id.btn1);

        btn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, SubActivity.class); //이동경로
                str = text.getText().toString();
                btr = text2.getText().toString();
                ctr = text3.getText().toString();

                A(str,btr,ctr);

                B(str,btr,ctr);

                C(str,btr,ctr);

                Map_p_1 = "" + value_p_1; // 원금 이자 문자열로 변환
                Map_w_1 = "" + value_w_1; // 원리금 이자 문자열로 변환
                Map_m_1 = "" + value_m_1; // 만기금 이자 문자열로 변환

                Map_p_1 = "" + value_p_1; // 원금 상환 문자열로 변환
                Map_w_1 = "" + value_w_1; // 원리금 상환 문자열로 변환
                Map_m_1 = "" + value_m_1; // 만기금 상환 문자열로 변환


                intent2.putExtra("value_p_1", Map_p_1); //원금 이자 값저장
                intent2.putExtra("value_p_2", Map_p_2); //원금 상환 값저장

                intent2.putExtra("value_w_1", Map_w_1); //원리금 이자 값저장
                intent2.putExtra("value_w_2", Map_w_2); //원리금 상환 값저장

                intent2.putExtra("value_m_1", Map_m_1); //만리금 이자 값저장
                intent2.putExtra("value_m_2", Map_m_2); //만리금 상환 값저장
            }
        });

    }
}