package demo;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int x = new Integer(1);
        Integer y = x;
    }

//    public void test1() {
//        int[] arr = {1,2,3,4,5};
//        Arrays.stream(arr).forEach(System.out::println);
//    }

    @org.junit.Test
    public void test2() {
        int[] arr = {1,2,3,4,5};
        List res = Arrays.asList(1,2,3);
        System.out.println(res.size());
    }


}
