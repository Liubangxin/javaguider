package stream.api;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    @Test
    public void test1 () {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        List<Integer> res = list.stream().filter(x -> x > 3).collect(Collectors.toList());
//        System.out.println(res);
        list.stream().filter(x -> x > 3).forEach(System.out::println);
    }

}
