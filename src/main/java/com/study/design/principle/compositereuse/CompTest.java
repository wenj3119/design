package com.study.design.principle.compositereuse;

/**
 * @Author jainfo026
 * @Date 2020/9/16
 * @Description
 */
public class CompTest {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MysqlConnection());
        productDao.addProduct();
    }
}
