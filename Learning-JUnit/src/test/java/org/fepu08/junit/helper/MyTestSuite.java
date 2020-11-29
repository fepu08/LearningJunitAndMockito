package org.fepu08.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * If you want to run a group of tests
 * you can do it in a test Suite
 *
 * @RunWith(Suite.class)
 * @Suite.SuiteClasses({classnames, ..})
 * public class TestSuiteClassName(){...}
 * */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        QuickBeforeAfterTest.class,
        ArraysCompareTest.class,
        StringHelperParameterizedTest.class,
        StringHelperTest.class
})
public class MyTestSuite {
}
