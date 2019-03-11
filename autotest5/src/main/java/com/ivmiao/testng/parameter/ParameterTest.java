package com.ivmiao.testng.parameter;


import org.testng.annotations.Test;

public class ParemeterTest {
    @Test
    public void paramTest1(String name,int age){
        System.out.println("name =" + name +"age = "+ age);
    }
}
