package com.course.testng;

import org.testng.annotations.*;

/**
 * @author liangjunjun
 * @date 2020-03-16-14:50
 **/
public class BasicAnnotation {

    //�������ע�⣬�����ѷ������Ϊ���Ե�һ����
    @Test
    public void testCase1(){
        System.out.println("���ǲ�������1");
    }

    @Test
    public void testCase2(){
        System.out.println("���ǲ�������2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod�����ڲ��Է���֮ǰ���е�");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod�����ڲ��Է���֮�����е�");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass������������֮ǰ���еķ���");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass������������֮�����еķ���");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite�����׼�");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite�����׼�");
    }
}
