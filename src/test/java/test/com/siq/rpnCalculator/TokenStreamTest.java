package test.com.siq.rpnCalculator;

import com.siq.rpnCalculator.TokenStream;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TokenStreamTest {

    @Test
    public void helloWorldTest() {
        TokenStream tokenStream = new TokenStream("   Hello World!  ");
        assertThat(tokenStream.hasMoreTokens(), is(true));
        tokenStream.getNextToken();
        assertThat(tokenStream.hasMoreTokens(), is(true));
        tokenStream.getNextToken();
        assertThat(tokenStream.hasMoreTokens(), is(false));
    }

}