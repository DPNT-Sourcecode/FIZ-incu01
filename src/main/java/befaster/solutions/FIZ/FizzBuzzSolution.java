package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        boolean containsThree = number.toString().contains("3");
        boolean containsFive = number.toString().contains("5");
        boolean containsBoth = containsThree && containsFive;
        String numberAsString = String.valueOf(number);
        StringBuilder returnValue = new StringBuilder();
        boolean notFizzBuss = false;
        if (number % 15 == 0 || (containsBoth)) {
            returnValue.append("fizz buzz");
        } else if (number % 5 == 0 && containsThree) {
            returnValue.append("fizz buzz");
        } else if (number % 3 == 0 && containsFive) {
            returnValue.append("fizz buzz");
        } else if (number % 3 == 0 || containsThree) {
            returnValue.append("fizz");
        } else if (number % 5 == 0 || containsFive) {
            returnValue.append("buzz");
        } else {
            returnValue.append(numberAsString);
            notFizzBuss = true;
        }

        //Check for deluxe
        boolean isDeluxe = false;
        if (number > 10) {
            int[] digits = new int[numberAsString.length()];

            for (int i = 0; i < numberAsString.length(); ++i) {
                digits[i] = Integer.parseInt(numberAsString.substring(i, i + 1));
            }
            //String [] split = String.valueOf(number).
            int baseInt = digits[0];
            
            for (int i = 1; i < digits.length; ++i) {
                isDeluxe = baseInt==digits[i];
                if (isDeluxe==false) {
                    break;
                }
            }
        }
        
        if (isDeluxe) {
            returnValue.append(" ").append("deluxe");
        }
        return returnValue.toString();
    }

}
