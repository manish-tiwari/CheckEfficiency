package junit.practice.Test;

import junit.practice.MathUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Manish on 7/12/2017.
 */@RunWith(value=Parameterized.class)
public class MathUtilsParameterizedTest {

    private int a;
    private int b;
    private int expected;


    public MathUtilsParameterizedTest(int a, int b, int expected) {
        this.a=a;
        this.b=b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{1,2,3},{2,2,4},{11,22,33}});
    }

    @Test
    public void test_AdditionWithParams() {
        System.out.println("a= "+a+", b= "+b);
        MathUtils mathUtils = new MathUtils();
        Assert.assertThat(mathUtils.add(this.a,this.b),is(this.expected));
    }

}
