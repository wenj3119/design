package com.study.design.principle.simpleresponsilbility.interfaced;

/**
 * @Author wenjun
 * @Date 2020/9/15
 * @Description
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();
    void studyCourse();

    void refundCourse();
}
