package com.example.asus.demo_0504;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ThridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        System.out.println("thrid________onCreate");
    }

    //可见不可操作
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("thrid_________onStart");
    }

    //获取焦点，可见可操作
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("thrid_________onResume");
    }
    //失去焦点，可见不可操作（弹出对话框式的activity）
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("thrid_________onPause");
    }
    //到后台，不可见，不可操作
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("thrid_________onStop");
    }

    //当前activity被销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("thrid_________onDestroy");
    }

    //重新启动，在后台被唤起
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("thrid_________onRestart");
    }
}
