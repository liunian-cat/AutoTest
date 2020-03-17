package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author liangjunjun
 * @date 2020-03-16-22:00
 **/
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+",age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"东华",36},
                {"白凤九",3}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法:name="+name+",age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法:name="+name+",age="+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodData(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"白浅",12},
                    {"夜华",9}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"折颜",37},
                    {"白真",18}
            };
        }
        return result;
    }
}
