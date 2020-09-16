package com.study.design.principle.compositereuse;

/**
 * @Author jainfo026
 * @Date 2020/9/16
 * @Description
 */
public class ProductDao {
    private DBConnection dbConnection;
    public void setDbConnection(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }
    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("huoqu dao de shuju ku lianjie :" + conn);
    }
}
