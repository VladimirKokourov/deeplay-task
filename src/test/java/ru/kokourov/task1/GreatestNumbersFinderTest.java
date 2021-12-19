package ru.kokourov.task1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GreatestNumbersFinderTest {

    private static GreatestNumbersFinder gnf = null;

    @Test
    public void findTest1() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = {3, 4, 5};
        gnf = new GreatestNumbersFinder(arr, 3);
        Assert.assertEquals(Arrays.toString(res), Arrays.toString(gnf.find()));
    }

    @Test
    public void findTest2() {
        int[] arr = {-1, -2, -7, 0, 2};
        int[] res = {0, 2};
        gnf = new GreatestNumbersFinder(arr, 2);
        Assert.assertEquals(Arrays.toString(res), Arrays.toString(gnf.find()));
    }

    @Test
    public void findTest3() {
        int[] arr = {0, 0, 0, 0, 0};
        int[] res = {0, 0, 0};
        gnf = new GreatestNumbersFinder(arr, 3);
        Assert.assertEquals(Arrays.toString(res), Arrays.toString(gnf.find()));
    }

    @AfterClass
    public static void afterClass() {
        gnf = null;
    }
}
