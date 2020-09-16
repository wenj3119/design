package com.study.design.principle.compositereuse;

/**
 * @Author jainfo026
 * @Date 2020/9/16
 * @Description
 */
public class OracleConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "huoqu OracleConnection";
    }
}
