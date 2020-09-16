package com.study.design.principle.dependencyinversion;

public class PyCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("jack study python");
    }
}
