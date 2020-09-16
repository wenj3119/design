package com.study.design.principle.compositereuse;

/**
 * @Author jainfo026
 * @Date 2020/9/16
 * @Description
 */
public class MysqlConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "houqu mysql connection";
    }
}
