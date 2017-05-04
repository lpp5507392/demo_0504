package com.example.asus.demo_0504;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    private RadioGroup group1;
    private RadioGroup group2;
    private RadioGroup group3;
    private Button submit;


    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i=getIntent();
        Student s=null;
        if(i!=null){
            //获取对象的方法
               s= (Student) i.getSerializableExtra("stu");
        }


        group1= (RadioGroup) findViewById(R.id.group1);
        group2= (RadioGroup) findViewById(R.id.group2);
        group3= (RadioGroup) findViewById(R.id.group3);
        submit= (Button) findViewById(R.id.submit);

        submit.setText(s.name+"--"+s.age+"--"+s.id+"--"+s.sex);


        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String result=null;
                if(checkedId==R.id.r1_a){
                     result="a";
                }else if(checkedId==R.id.r1_b){
                    result="b";
                }else if(checkedId==R.id.r1_c){
                    result="c";
                }else{
                    result="d";
                }

                if(result.equals("a")){
                    count++;
                }




            }
        });

        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String result=null;
                if(checkedId==R.id.r2_a){
                    result="a";
                }else if(checkedId==R.id.r2_b){
                    result="b";
                }else if(checkedId==R.id.r2_c){
                    result="c";
                }else{
                    result="d";
                }

                if(result.equals("a")){
                    count++;
                }




            }
        });
        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String result=null;
                if(checkedId==R.id.r3_a){
                    result="a";
                }else if(checkedId==R.id.r3_b){
                    result="b";
                }else if(checkedId==R.id.r3_c){
                    result="c";
                }else{
                    result="d";
                }

                if(result.equals("a")){
                    count++;
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, count+"", Toast.LENGTH_SHORT).show();
            }
        });


    }



}
