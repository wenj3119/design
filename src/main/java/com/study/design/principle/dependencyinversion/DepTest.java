package com.study.design.principle.dependencyinversion;

public class DepTest {
    public static void main(String[] args) {
        /* ------v1-------*/
         /*
        Jack jack = new Jack();
        jack.studyJavaCourse();
        jack.studyPyCourse();*/
        /* ------v2------*/
       /* Jack jack = new Jack();
        jack.study(new JavaCourse());
        jack.study(new PyCourse());*/
        /* ------v3------*/
        /*Jack jack = new Jack(new JavaCourse());
        jack.study();
        Jack jack1 = new Jack(new PyCourse());
        jack1.study();*/
        /* ------v4------*/
        Jack jack = Jack.getJack();
        jack.setCourse(new JavaCourse());
        jack.study();
        jack.setCourse(new PyCourse());
        jack.study();
    }
}
