package lambda;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

/**
 * 函数式接口
 * 1. 只有一个方法的接口
 * 2. 接口的实现，右边为接口方法的实现
 */

public class Test1 {

    /**
     * 消费型接口
     */
    @Test
    public void test1 () {
        Consumer consumer = x -> System.out.println(x);
        consumer.accept(1);
    }

    @Test
    public void test2 () {
        Supplier<String> supplier = () -> "hello";
        assertEquals(supplier.get(), "hello");
    }

    @Test
    public void test3 () {
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("xxx"));
    }

    @Test
    public void test4 () {
        Predicate<String> predicate = x -> x.length() > 5;
        System.out.println(predicate.test("he"));
    }
}
