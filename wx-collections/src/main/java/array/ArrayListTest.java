package array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    @Test
    public void test1() {
        int[] dst = new int[5];
        int[] src = {1,2,3,4};
        System.arraycopy(src, 0, dst, 0, src.length);
        System.out.println(Arrays.toString(dst));
    }

    @Test
    public void test2() {
        int[] src = {1,2,3,4};
        int[] dst = Arrays.copyOf(src, 5);
        System.out.println(Arrays.toString(dst));
    }

}
