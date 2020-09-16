package com.study.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class Employee {
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<>();
        for(int i = 0; i < 15; i ++){
            courseList.add(new Course());
        }
        System.out.println("muqian yi fabu de kecheng shu liang" + courseList.size());
    }
}
