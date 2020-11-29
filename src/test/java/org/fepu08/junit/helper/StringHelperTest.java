package org.fepu08.junit.helper;

import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringHelperTest {
    @Test
    public void test(){
        StringHelper helper = new StringHelper();
        //assertEqueals(excpected, actual)
        assertEquals("ABC", "ABC");
        //AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }
}
