package com.company.Task5;
import org.junit.Assert;
import org.junit.Test;
public class Task5Test {

    @Test
    public void TestTask5() {
        Integer[] sequence1 = {1, 2, 3, 4, 5};
        Integer[] sequence2 = {5, 4, 3, 2, 1};
        Integer[] sequence3 = {5, 1, 3, 2, 4};
        Assert.assertEquals(0, Task5.FindMinimumElementsToRemove(sequence1));
        Assert.assertEquals(4, Task5.FindMinimumElementsToRemove(sequence2));
        Assert.assertEquals(2, Task5.FindMinimumElementsToRemove(sequence3));
    }
}
