import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldProcessNumberOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.processNumber(1));
    }

    @Test
    public void shouldProcessNumberTwo() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals( "2", fizzBuzz.processNumber(2));
    }

    @Test
    public void givenIntegerSevenProcessedNumberIsStringSeven() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals( "7", fizzBuzz.processNumber(7));
    }
}