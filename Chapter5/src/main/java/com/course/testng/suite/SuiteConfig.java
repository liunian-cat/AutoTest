package com.course.testng.suite;

import org.testng.annotations.*;

import java.awt.*;

/**
 * @author liangjunjun
 * @date 2020-03-16-20:40
 **/
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite������");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite������");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }


}
