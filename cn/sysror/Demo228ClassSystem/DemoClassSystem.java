package cn.sysror.Demo228ClassSystem;

import java.util.Arrays;

public class DemoClassSystem {
    public static void main(String[] args) {
        int[] src = {9, 2, 6, 1, 3};
        int[] dest = {1, 2, 3, 4, 5};
        System.arraycopy(src, 0, dest, 0, 5);
        System.out.println(Arrays.toString(dest)); // [9, 2, 6, 1, 3]
    }
}