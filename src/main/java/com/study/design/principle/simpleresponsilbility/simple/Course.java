package com.study.design.principle.simpleresponsilbility.simple;

public class Course {
    public void study(String courseName){
        if("zhibo".equals(courseName)){
            System.out.println("no kuaijin");
        }else{
            System.out.println("renyikuaijin");
        }
    }
}
