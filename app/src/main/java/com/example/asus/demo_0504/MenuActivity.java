package com.example.asus.demo_0504;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        System.out.println("Menu_________onCreate");


        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,MainActivity.class);
                intent.putExtra("name","zhangsan");
                intent.putExtra("age",20);

                startActivity(intent);
//                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,SecondActivity.class);

                Student zs=new Student("100","zs",20,"男");
                //如果页面之间传递对象，对象所属的类一定要实现Serializable 接口
                intent.putExtra("stu",zs);

                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,ThridActivity.class);



                startActivity(intent);
            }
        });

    }

    //可见不可操作
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Menu_________onStart");
    }

    //获取焦点，可见可操作
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Menu_________onResume");
    }
    //失去焦点，可见不可操作（弹出对话框式的activity）
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Menu_________onPause");
    }
   //到后台，不可见，不可操作
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Menu_________onStop");
    }

    //当前activity被销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Menu_________onDestroy");
    }

    //重新启动，在后台被唤起
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Menu_________onRestart");
    }
}
