import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldProcessNumberOne() {
        assertEquals("1", fizzBuzz.processNumber(1));
    }

    @Test
    public void shouldProcessNumberTwo() {
        assertEquals( "2", fizzBuzz.processNumber(2));
    }

    @Test
    public void givenIntegerSevenProcessedNumberIsStringSeven() {
        assertEquals( "7", fizzBuzz.processNumber(7));
    }

    @Test
    public void givenIntegerThreeProcessedNumberIsStringFizz(){
        assertEquals("Fizz", fizzBuzz.processNumber(3));
    }
}