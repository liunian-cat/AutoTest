package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2020-03-16-21:11
 **/
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1�е�stu1111����");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1�е�stu2222����");
    }
}
