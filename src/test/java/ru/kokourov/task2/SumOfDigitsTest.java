package ru.kokourov.task2;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SumOfDigitsTest {
    private static SumOfDigits sod = null;

    private final int number;
    private final int result;

    public SumOfDigitsTest(int number, int result) {
        this.number = number;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {555, 15},
                        {-555, 5},
                        {0, 0},
                        {1, 1}
                }
        );
    }

    @Test
    public void sumOfDigitsOfANumberTest() {
        Assert.assertEquals(sod.sumOfDigitsOfANumber(number), result);
    }

    @BeforeClass
    public static void beforeClass() {
        sod = new SumOfDigits();
    }

    @AfterClass
    public static void afterClass() {
        sod = null;
    }
}
