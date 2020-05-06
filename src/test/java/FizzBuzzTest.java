import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldProcessNumberOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.processNumber(1), "1");
    }
}