package com.study.design.principle.liskovsutiution.methodparam;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class Children extends Base{
   /* @Override
    public void method(HashMap map) {
        System.out.println("children zhixing HashMap");
    }*/

    public void method(Map map){
        System.out.println("children zhixing Map");
    }
}
