package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2020-03-16-22:33
 **/
public class TimeOutTest {

    @Test(timeOut = 3000)//��λΪ����
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 3000)//��λΪ����
    public void testFailed() throws InterruptedException{
        Thread.sleep(5000);
    }
}
