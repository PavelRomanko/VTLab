package com.company.Task7;

import org.junit.Assert;
import org.junit.Test;

public class Task7Test {
    @Test
    public void TestTask7() {
        Integer[] array1 = {3, 1, 4, 2};
        Integer[] array2 = {5, 2, 6, 1, 3};
        Integer[] array3 = {9, 7, 5, 8};
        Integer[] expectedArray1 = {1, 2, 3, 4};
        Integer[] expectedArray2 = {1, 2, 3, 5, 6};
        Integer[] expectedArray3 = {5, 7, 8, 9};
        Assert.assertArrayEquals(expectedArray1, Task7.SortArray(array1));
        Assert.assertArrayEquals(expectedArray2, Task7.SortArray(array2));
        Assert.assertArrayEquals(expectedArray3, Task7.SortArray(array3));
    }
}