/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author niyioladeji
 */
public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzzSolution;
    
    @Before
    public void setUp() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void fizzBuzz() {
        assertThat(fizzBuzzSolution.fizzBuzz(15), equalTo("fizz buzz fake deluxe")); //15
        assertThat(fizzBuzzSolution.fizzBuzz(10), equalTo("buzz")); // 5
        assertThat(fizzBuzzSolution.fizzBuzz(9), equalTo("fizz")); //3
        assertThat(fizzBuzzSolution.fizzBuzz(8), equalTo("8")); //None 3 & 5
        assertThat(fizzBuzzSolution.fizzBuzz(35), equalTo("fizz buzz fake deluxe")); //None 3 & 5
        assertThat(fizzBuzzSolution.fizzBuzz(57), equalTo("fizz buzz fake deluxe")); //None 3 & 5
        assertThat(fizzBuzzSolution.fizzBuzz(34), equalTo("fizz")); //None 34
        assertThat(fizzBuzzSolution.fizzBuzz(130), equalTo("fizz buzz deluxe")); //None 130
        assertThat(fizzBuzzSolution.fizzBuzz(53), equalTo("fizz buzz fake deluxe")); //None 35
        assertThat(fizzBuzzSolution.fizzBuzz(30), equalTo("fizz buzz deluxe")); //None 53
        assertThat(fizzBuzzSolution.fizzBuzz(33), equalTo("fizz fake deluxe")); //None 53
        assertThat(fizzBuzzSolution.fizzBuzz(35), equalTo("fizz buzz fake deluxe")); //None 53
        assertThat(fizzBuzzSolution.fizzBuzz(213), equalTo("fizz fake deluxe")); //None 53
        assertThat(fizzBuzzSolution.fizzBuzz(52), equalTo("buzz deluxe")); //None 53
        assertThat(fizzBuzzSolution.fizzBuzz(55), equalTo("buzz fake deluxe")); //None 53
        assertThat(fizzBuzzSolution.fizzBuzz(163), equalTo("fizz")); //None 53
        assertThat(fizzBuzzSolution.fizzBuzz(43), equalTo("fizz")); //None 53
        assertThat(fizzBuzzSolution.fizzBuzz(13), equalTo("fizz")); //None 53
        
    }
}
