package test.com.siq.rpnCalculator;

import com.siq.rpnCalculator.RpnCalculator;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class RpnCalculatorTest {

    @Test
    public void unneededAndNotDesired() {
        RpnCalculator rpnCalculator = new RpnCalculator();
        assertThat(rpnCalculator,is(notNullValue()));
    }
}