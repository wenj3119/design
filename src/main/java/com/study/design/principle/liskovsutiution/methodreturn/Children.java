package com.study.design.principle.liskovsutiution.methodreturn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class Children extends Base{
    @Override
    public Map method() {
        HashMap hashMap = new HashMap();
        System.out.println("zhixing zilei children");
        hashMap.put("msg","flei method");
        return hashMap;
    }
}
