package com.company.Task8;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class Task8Test {
    @Test
    public void TestTask8() {
        Integer[] sequence1 = {1, 3, 5, 7, 9};
        Integer[] sequence2 = {2, 4, 6, 8};
        Integer[] sequence3 = {1, 2, 3, 4, 5};
        Integer[] sequence4 = {6, 7, 8, 9, 10};

        List<Integer> expectedPositions1 = List.of(1, 2, 3, 4);
        Assert.assertEquals(expectedPositions1, Task8.FindInsertionPositions(sequence1, sequence2));

        List<Integer> expectedPositions2 = List.of(5, 6, 7, 8, 9);
        Assert.assertEquals(expectedPositions2, Task8.FindInsertionPositions(sequence3, sequence4));
    }
}