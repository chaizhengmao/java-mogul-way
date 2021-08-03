package com.cimu;

import java.util.Arrays;

public class CheckUtils {

    public static void main(String[] args) {
        System.out.println(checkAllNotNull(null));
        System.out.println(checkAllNotNull(""));
        System.out.println(checkAllNotNull("", null, 11));
        System.out.println(checkNotAllNull(null));
        System.out.println(checkNotAllNull(""));
        System.out.println(checkNotAllNull("", null));
        System.out.println(checkNotAllNull("", 1212));
    }

    public static boolean checkAllNotNull(Object... params) {
        if (params == null || params.length == 0 || "".equals(params)) {
            return false;
        }
        Object[] resultArray = Arrays.stream(params).parallel().filter(item -> item == null || "".equals(item)).toArray();
        return !(resultArray.length > 0);
    }

    public static boolean checkNotAllNull(Object... params) {
        if (params == null || params.length == 0 || "".equals(params)) {
            return false;
        }
        Object[] resultArray = Arrays.stream(params).parallel().filter(item -> item == null || "".equals(item)).toArray();
        return resultArray.length != params.length;
    }
}
