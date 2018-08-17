package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        boolean containsThree = number.toString().contains("3");
        boolean containsFive = number.toString().contains("5");
        boolean containsBoth = containsThree&&containsFive;
        System.out.println(containsBoth);
        if (number % 15 == 0 || (containsBoth)) {
            return "fizz buzz";
        } else
        if (number % 3 == 0 || containsThree) {
            return "fizz";
        } else if (number % 5 == 0 || containsFive) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

}
