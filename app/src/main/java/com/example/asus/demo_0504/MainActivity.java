package com.example.asus.demo_0504;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText et_num1;
    private EditText et_num2;
    private Button btn_add;
    private Button btn_minus;
    private TextView tv_result;
    String name;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1 先获取意图对象
        Intent intent=getIntent();
        if(intent!=null){
             name=intent.getStringExtra("name");
             age=intent.getIntExtra("age",0);
        }





        et_num1= (EditText) findViewById(R.id.et_num1);
        et_num2= (EditText) findViewById(R.id.et_num2);
        btn_add= (Button) findViewById(R.id.add);
        btn_minus= (Button) findViewById(R.id.minus);
        tv_result= (TextView) findViewById(R.id.tv_result);

        tv_result.setText(name+"--"+age);


        btn_add.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String str_num1=et_num1.getText().toString().trim();
        String str_num2=et_num2.getText().toString().trim();
        //数字字符串转化为数字
        int num1=Integer.parseInt(str_num1);
        int num2=Integer.parseInt(str_num2);
        int result=0;

        if(v.getId()==R.id.add){
            result=num1+num2;
        }else if(v.getId()==R.id.minus){
             result=num1-num2;
        }

        tv_result.setText(result+"");

    }
}
