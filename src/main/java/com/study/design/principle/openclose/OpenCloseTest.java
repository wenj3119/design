package com.study.design.principle.openclose;

public class OpenCloseTest {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1,"JavaCource",6300.00);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCourse;
        System.out.println("IcourseId: " + javaDiscountCourse.getId() +"\n"
        +"IcourseName: " + javaDiscountCourse.getName() +"\n"
        +"IcoursePrice: " + javaDiscountCourse.getPrice() + "\n"
        + "javaDiscountCourse: " + javaDiscountCourse.getDiscountPrice());
    }
}