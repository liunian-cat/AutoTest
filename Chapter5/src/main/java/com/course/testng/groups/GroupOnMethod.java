package com.course.testng.groups;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2020-03-16-21:04
 **/
public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("���Ƿ������Ĳ��Է���1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("���Ƿ������Ĳ��Է���2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("���ǿͻ�����Ĳ��Է���3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("���ǿͻ�����Ĳ��Է���4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("���Ƿ����������֮ǰ���еķ���");
    }

    @AfterGroups("server")
    public void afterroupsOnServer(){
        System.out.println("���Ƿ����������֮�����еķ���");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("���ǿͻ���������֮ǰ���еķ���");
    }

    @AfterGroups("client")
    public void afterroupsOnClient(){
        System.out.println("���ǿͻ���������֮�����еķ���");
    }
}
