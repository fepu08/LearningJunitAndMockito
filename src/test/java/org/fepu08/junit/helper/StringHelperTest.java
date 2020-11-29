package org.fepu08.junit.helper;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    /**
     * Junit test methods must NOT be private nor may it return a value (must to be void)
     * and must use @Test annotation
     */
    @Test
    public void truncateAInFirst2Positions(){
        //assertEqueals(excpected, actual)
        assertEquals("ABC", "ABC");
        //AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    /**
     * When unit testing complex scenarios not good to have
     * more than one conditions tested in tha same unit test
     * one of its benefits is you see which method fall
     * */
    @Test
    public void truncateAInFirst2Positions_AInFirst2Positions(){
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void truncateAInFirst2Positions_AInFirstPosition(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void truncateAInFirst2Positions_DoesntContainA(){
        assertEquals("CD", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void truncateAInFirst2Positions_AInTheEnd(){
        assertEquals("CD", helper.truncateAInFirst2Positions("CDAA"));
    }
}
