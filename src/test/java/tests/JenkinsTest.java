package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsTest {

    @Test
    public void printTest() {
        System.out.println("✅ Jenkins setup is working fine.");
    }

    @Test
    public void additionTest() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        Assert.assertEquals(sum, 30, "Addition test passed");
    }

    @Test
    public void stringEqualityTest() {
        String actual = "Hello Jenkins";
        String expected = "Hello Jenkins";
        Assert.assertEquals(actual, expected, "String match test passed");
    }

    @Test
    public void trueConditionTest() {
        boolean status = true;
        Assert.assertTrue(status, "True condition test passed");
    }

    @Test
    public void falseConditionTest() {
        boolean status = false;
        Assert.assertFalse(status, "False condition test passed");
    }
}
