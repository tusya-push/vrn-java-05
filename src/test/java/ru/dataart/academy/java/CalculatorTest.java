package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class CalculatorTest {

    @Test
    public void testSum() {
        assert (Calculator.getSum(Arrays.asList(1, 2, 3), Arrays.asList(1, 2)).equals(342));
        assert (Calculator.getSum(Arrays.asList(6, 4, 3), Arrays.asList(5, 6, 8)).equals(1211));
        assert (Calculator.getSum(Arrays.asList(1, 5), Collections.singletonList(0)).equals(51));
        assert (Calculator.getSum(Arrays.asList(1, 6, 4), Arrays.asList(3, 2)).equals(484));
    }

    @Test
    public void testOddList() {
        assert (Calculator.getOddElements(Arrays.asList(1, 2, 3)).equals(Arrays.asList(1, 3)));
        assert (Calculator.getOddElements(Arrays.asList(1, 2)).equals(Collections.singletonList(1)));
        assert (Calculator.getOddElements(Collections.emptyList()).equals(Collections.emptyList()));
        assert (Calculator.getOddElements(Arrays.asList("One", "Two")).equals(Collections.singletonList("One")));
    }

    @Test
    public void testBounds() {
        assert (Calculator.getBounds(Collections.emptyList()).equals(Collections.emptyList()));
        assert (Calculator.getBounds(Collections.singletonList(1)).equals(Collections.singletonList(1)));
        assert (Calculator.getBounds(Arrays.asList(1, 3)).equals(Arrays.asList(1, 3)));
        assert (Calculator.getBounds(Arrays.asList("One", "Two")).equals(Arrays.asList("One", "Two")));
        assert (Calculator.getBounds(Arrays.asList(1, 2, 3)).equals(Arrays.asList(1, 3)));
        assert (Calculator.getBounds(Arrays.asList(1, 2, 3, 4)).equals(Arrays.asList(1, 4)));
    }
}
