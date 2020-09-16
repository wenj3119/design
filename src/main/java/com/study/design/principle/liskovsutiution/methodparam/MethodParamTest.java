package com.study.design.principle.liskovsutiution.methodparam;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class MethodParamTest {
    public static void main(String[] args) {
        Children children = new Children();
        Map hashMap = new HashMap();
        children.method(hashMap);
    }
}
