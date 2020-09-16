package com.study.design.principle.openclose;

public class JavaDiscountCourse extends JavaCource{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }


    public Double getDiscountPrice() {
        return getPrice() * 0.8;
    }
}
