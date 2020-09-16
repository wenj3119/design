package com.study.design.principle.dependencyinversion;

public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("jack study java" );
    }
}
