package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        boolean containsThree = number.toString().contains("3");
        boolean containsFive = number.toString().contains("5");
        boolean containsBoth = containsThree && containsFive;
        StringBuilder returnValue = new StringBuilder();
        boolean notFizzBuss = false;
        if (number % 15 == 0 || (containsBoth)) {
            returnValue.append("fizz buzz") ;
        } else if (number % 5 == 0 && containsThree) {
            returnValue.append("fizz buzz") ;
        } else if (number % 3 == 0 && containsFive) {
            returnValue.append("fizz buzz") ;
        } else if (number % 3 == 0 || containsThree) {
            returnValue.append("fizz");
        } else if (number % 5 == 0 || containsFive) {
            returnValue.append("buzz");
        } else {
            returnValue.append(String.valueOf(number));
            notFizzBuss = true;
        }
        
        //Check for deluxe
        if (number > 10) {
            
        }
        
        return returnValue.toString();
    }

}
