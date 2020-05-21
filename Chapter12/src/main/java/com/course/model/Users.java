package com.course.model;

import lombok.Data;

/**
 * @author liangjunjun
 * @date 2020-03-22-14:36
 **/
@Data
public class Users {
    private int id;
    private String username;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;

    public String toString(){
        return (
                "{id:"+id+","+
                "username:"+username+","+
                "password:"+password+","+
                "age:"+age+","+
                "sex:"+sex+","+
                "permission:"+permission+","+
                "isDelete:"+isDelete+"}"
                );
    }
}
