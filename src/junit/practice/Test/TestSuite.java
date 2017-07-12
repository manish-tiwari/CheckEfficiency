package junit.practice.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Manish on 7/12/2017.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MathUtilsParameterizedTest.class,
        TestPrintMessage.class
})
public class TestSuite {
}
