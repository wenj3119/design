package com.study.design.principle.liskovsutiution.methodreturn;

/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class MethodParamReturn {
    public static void main(String[] args) {
        Children children = new Children();
        System.out.println(children.method());
    }
}
