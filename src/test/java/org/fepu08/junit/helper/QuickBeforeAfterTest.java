package org.fepu08.junit.helper;

import org.junit.*;

import static org.junit.Assert.*;

public class QuickBeforeAfterTest {
    /**
     * @BeforeClass methods only execute once
     * must be static
     * */
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    /**
     * Methods with @Before
     * runs BEFORE every single tests
     * */
    @Before
    public void setup(){
        System.out.println("Before Test");
    }

    @Test
    public void test1(){
        System.out.println("test1 executed");
    }

    @Test
    public void test2(){
        System.out.println("test2 executed");
    }

    /**
     * Methods with @After
     * runs AFTER every single tests
     * */
    @After
    public void teardown(){
        System.out.println("After test");
    }

    /**
     * @AfterClass methods only execute once
     * must be static
     * */
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
}
