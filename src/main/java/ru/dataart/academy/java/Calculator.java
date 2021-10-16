package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */

    public static Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        return getReverseInt(firstNumber) + getReverseInt(secondNumber);
    }

    private static int getReverseInt(List<Integer> num) {
        if (num.isEmpty()) return 0;
        if (num.size() == 1) return num.get(0);
        // the solution with for loop
        int res = 0;
        for (int i = 0; i < num.size(); i++) {
            res += num.get(i) * Math.pow(10, i);
        }
        return res;

        // the solution with foreach loop
//        int res = 0, pow = 1;
//        for (Integer i : num) {
//            res += i * pow;
//            pow *= 10;
//        }
//        return res;

        // the solution with strings =)
//        Collections.reverse(num);
//        StringBuilder builder = new StringBuilder();
//        for (int i : num) builder.append(i);
//        return Integer.parseInt(builder.toString());
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */

    public static <T> List<T> getOddElements(List<T> list) {
        if (list.isEmpty() || list.size() == 1) return list;
        ArrayList<T> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            // it's odd elements (the index starts from 0)
            if (i % 2 == 0) res.add(list.get(i));
        }
        return res;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3, 4] -> [1, 4]
     */

    public static <T> List<T> getBounds(List<T> list) {
        // empty, one or two elements
        if (list.isEmpty() || list.size() == 1 || list.size() == 2) return list;
        return Arrays.asList(list.get(0), list.get(list.size() - 1));
    }

}
