public class FizzBuzz {
    public String processNumber(Integer number) {

        if (0 == number % 3) return "Fizz";
        else if(number == 5) return "Buzz";
        return String.valueOf(number);
    }
}
