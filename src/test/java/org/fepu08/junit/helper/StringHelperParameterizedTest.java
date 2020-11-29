package org.fepu08.junit.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * You can't use two different Parameterized test in the same class
 * So you need to create a new class in this case
 * */
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
    StringHelper helper = new StringHelper();
    private String input;
    private String expecterOutput;

    public StringHelperParameterizedTest(String input, String expecterOutput) {
        this.input = input;
        this.expecterOutput = expecterOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs[][] = {
                {"AACD", "CD"},
                {"AACD", "CD"},
                {"CDEF", "CDEF"},
                {"CDAA", "CDAA"}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions(){
        assertEquals(expecterOutput, helper.truncateAInFirst2Positions(input));
    }

    //@Test
    //public void testTruncateAInFirst2Positions(){
    //    //assertEquals(expected, actual)
    //    assertEquals("ABC", "ABC");
    //    //AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
    //    assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    //    assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    //    assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    //    assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    //}

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions(){
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_DoesntContainA(){
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInTheEnd(){
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("BCASDBC"));
    }
}
