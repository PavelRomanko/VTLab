package com.company.Task6;
import org.junit.Assert;
import org.junit.Test;

public class Task6Test {
    @Test
    public void TestTask6() {
        Integer[] sequence1 = {1, 2, 3};
        Integer[] sequence2 = {5, 6, 7, 8};
        Integer[] sequence3 = {9, 10};
        int[][] expectedMatrix1 = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        int[][] expectedMatrix2 = {{5, 6, 7, 8}, {6, 7, 8, 5}, {7, 8, 5, 6}, {8, 5, 6, 7}};
        int[][] expectedMatrix3 = {{9, 10}, {10, 9}};
        Assert.assertArrayEquals(expectedMatrix1, Task6.CreateShiftedMatrix(sequence1));
        Assert.assertArrayEquals(expectedMatrix2, Task6.CreateShiftedMatrix(sequence2));
        Assert.assertArrayEquals(expectedMatrix3, Task6.CreateShiftedMatrix(sequence3));
    }
}