package com.study.design.principle.dependencyinversion;

public class Jack {
   /* public void studyJavaCourse(){
        System.out.println("jack study java" );
    }

    public void studyPyCourse(){
        System.out.println("jack study python");
    }*/
    /*public void study(ICourse course){
        course.study();
    }*/
    private ICourse course;
   /* public Jack(ICourse course){
        this.course = course;
    }*/
    private Jack(){
    }
    private static Jack jack = new Jack();
    private Jack(ICourse course){
        this.course = course;
    }
    public static Jack getJack(){
        return jack;
    }
    public void setCourse(ICourse course){
        this.course = course;
    }
    public void study(){
        this.course.study();
    }

}
