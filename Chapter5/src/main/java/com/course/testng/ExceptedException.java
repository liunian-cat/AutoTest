package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2020-03-16-21:25
 **/
public class ExceptedException {

    /**
     * 在我们期望结果为某个异常的时候使用异常测试
     * 比如：传入不合法的参数，程序抛出了异常
     */
    //这是一个测试会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();

    }
}
