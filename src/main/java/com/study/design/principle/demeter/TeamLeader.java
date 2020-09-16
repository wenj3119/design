package com.study.design.principle.demeter;


/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class TeamLeader {
    public void commandCheckNumber(Employee employee){
        employee.checkNumberOfCourses();
    };
}
