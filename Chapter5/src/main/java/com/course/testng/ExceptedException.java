package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2020-03-16-21:25
 **/
public class ExceptedException {

    /**
     * �������������Ϊĳ���쳣��ʱ��ʹ���쳣����
     * ���磺���벻�Ϸ��Ĳ����������׳����쳣
     */
    //����һ�����Ի�ʧ�ܵ��쳣����
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("����һ��ʧ�ܵ��쳣����");
    }

    //����һ���ɹ����쳣����
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("�����ҵ��쳣����");
        throw new RuntimeException();

    }
}
