package demo;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TargetObject {
    private String value;

    public TargetObject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("demo.TargetObject");
        // 获取所有方法
//        Method[] methods = clazz.getMethods();
//        Arrays.stream(methods).forEach(method -> {
//            System.out.println(method.getName());
//        });

        // 获取所有方法
        Method[] methods2 = clazz.getDeclaredMethods();
        Arrays.stream(methods2).forEach(method -> {
            System.out.println(method.getName());
        });
        TargetObject targetObject = (TargetObject) clazz.newInstance();

    }

}