package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2020-03-16-20:59
 **/
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1Ö´ÐÐ");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2Ö´ÐÐ");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3Ö´ÐÐ");
    }
}
