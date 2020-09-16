package com.study.design.principle.simpleresponsilbility.method;

/**
 * @Author wenjun
 * @Date 2020/9/15
 * @Description
 */
public class Method {
    private void modifyUserInfo(String userName,String address){
        userName = "jack";
        address = "beijing";
    }

    private void modifyUserInfo(String userName,String ... fileds){

    }

    private void modifyUserInfo(String userName,String address,boolean bool){
        if(bool){

        }else{

        }
    }
    private void modifyUserName(String userName){

    }
    private void modifyAddress(){

    }
}
