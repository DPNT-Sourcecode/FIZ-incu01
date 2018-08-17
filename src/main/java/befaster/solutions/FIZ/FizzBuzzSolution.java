package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String numberAsAString = new StringBuilder(number).toString();
        boolean containsThree = numberAsAString.contains("3");
        boolean containsFive = numberAsAString.contains("5");
        if (number % 15 == 0 || (containsThree&&containsFive)) {
            return "fizz buzz";
        } else
        if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

}
