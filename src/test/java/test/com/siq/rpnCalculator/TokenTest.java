package test.com.siq.rpnCalculator;

import com.siq.rpnCalculator.Token;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class TokenTest {

    @Test
    public void unneededAndNotDesired() {
        Token token = new Token("");
        assertThat(token,is(notNullValue()));
    }
}
