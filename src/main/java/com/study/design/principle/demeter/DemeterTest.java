package com.study.design.principle.demeter;

/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class DemeterTest {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
    }
}
