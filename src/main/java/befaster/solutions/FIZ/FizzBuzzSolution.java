package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        boolean containsThree = number.toString().contains("3");
        boolean containsFive = number.toString().contains("5");
        boolean containsBoth = containsThree && containsFive;
        String numberAsString =  String.valueOf(number);
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
            returnValue.append(numberAsString);
            notFizzBuss = true;
        }
        
        //Check for deluxe
        if (number > 10) {
            int length = numberAsString.length();
            String firstChar = numberAsString.substring(0, 1);
            System.out.println(firstChar);
            //String [] split = String.valueOf(number).
        }
        
        return returnValue.toString();
    }

}
