package test.com.siq.rpnCalculator;

import com.siq.rpnCalculator.TokenStream;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class TokenStreamTest {

    @Test
    public void unneededAndNotDesired() {
        TokenStream tokenStream = new TokenStream("");
        assertThat(tokenStream,is(notNullValue()));
    }
}