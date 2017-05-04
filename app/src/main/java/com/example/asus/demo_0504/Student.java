package com.example.asus.demo_0504;

import java.io.Serializable;

/**
 * Created by asus on 2017/5/4.
 */
public class Student implements Serializable{
    public  String id;
    public String name;
    public int age;
    public String sex;

    public Student(String id,String name,int age,String sex){
        this.id=id;
        this.name=name;
        this.age=age;
        this.sex=sex;
    }


}
