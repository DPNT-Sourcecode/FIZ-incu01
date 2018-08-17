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
            if (containsFive || containsThree) {
                if (number % 2 == 0) {
                    returnValue.append("fizz buzz deluxe");
                } else {
                    returnValue.append("fizz buzz fake deluxe");
                }
            } else {
                returnValue.append("fizz buzz");
            }
        } else if (number % 5 == 0 && containsThree) {
            if (containsFive || containsThree) {
                if (number % 2 == 0) {
                    returnValue.append("fizz buzz deluxe");
                } else {
                    returnValue.append("fizz buzz fake deluxe");
                }
            } else {
                returnValue.append("fizz buzz");
            }
        } else if (number % 3 == 0 && containsFive) {
            if (containsFive || containsThree) {
                if (number % 2 == 0) {
                    returnValue.append("fizz buzz deluxe");
                } else {
                    returnValue.append("fizz buzz fake deluxe");
                }
            } else {
                returnValue.append("fizz buzz");
            }
        }
        //Fizz deluxe / Fizz fake deluxe
        else if (number % 3 == 0 && containsThree) {
            if (number % 2 == 0) {
                returnValue.append("fizz deluxe");
            } else {
                returnValue.append("fizz fake deluxe");
            }
        } else if (number % 3 == 0 ) {
            if (containsThree) {
                if (number % 2 == 0) {
                    returnValue.append("fizz deluxe");
                } else {
                    returnValue.append("fizz fake deluxe");
                }
            } else {
                returnValue.append("fizz");
            }
        } else if (containsThree) {
            if (number % 3 == 0) {
                if (number % 2 == 0) {
                    returnValue.append("fizz deluxe");
                } else {
                    returnValue.append("fizz fake deluxe");
                }
            } else {
                returnValue.append("fizz");
            }
        }
        else if (number % 5 == 0 && containsFive) {
            if (number % 2 == 0) {
                returnValue.append("buzz deluxe");
            } else {
                returnValue.append("buzz fake deluxe");
            }
        } else if (number % 5 == 0) {
            if (containsFive) {
                if (number % 2 == 0) {
                    returnValue.append("buzz deluxe");
                } else {
                    returnValue.append("buzz fake deluxe");
                }
            } else {
                returnValue.append("buzz");
            }
        } else if (containsFive) {
            if (number % 5 == 0) {
                if (number % 2 == 0) {
                    returnValue.append("buzz deluxe");
                } else {
                    returnValue.append("buzz fake deluxe");
                }
            } else {
                returnValue.append("buzz");
            }
        }
        
        else {
            returnValue.append(numberAsString);
            //notFizzBuss = true;
        }

        return returnValue.toString();
    }

}
