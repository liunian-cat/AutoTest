package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2020-03-16-21:11
 **/
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3�е�teacher1����");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3�е�teacher2����");
    }
}
