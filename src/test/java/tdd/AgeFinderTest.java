package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AgeFinderTest {


    @Test
    public void verify_2_digits_in_input(){
        String input = "GW05MXZ";
        AgeFinder cut = new AgeFinder();
        String expectedResult = "55";

        String actualResult = cut.findNextAge(input);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void verify_empty_input(){
        String input = "";
        AgeFinder cut = new AgeFinder();

        Exception e = assertThrows(IllegalArgumentException.class,() -> {
            cut.findNextAge(input);
        });

        assertEquals("Input must not be empty",e.getMessage());

    }
    @Test
    public void verify_if_input_is_in_first_half_of_the_year(){
        String input = "GW05MXZ";
        AgeFinder cut = new AgeFinder();
        String expectedResult = "55";

        String actualResult = cut.findNextAge(input);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void verify_if_input_is_in_second_half_of_the_year(){
        String input = "GW55MXZ";
        AgeFinder cut = new AgeFinder();
        String expectedResult = "06";

        String actualResult = cut.findNextAge(input);

        assertEquals(expectedResult,actualResult);
    }

//
//    @Test
//    public void verify_when_input_is_50(){
//
//        String input = "GW50MXZ";
//        AgeFinder cut = new AgeFinder();
//        String expectedResult = "00";
//
//        String actualResult = cut.findNextAge(input);
//
//        assertEquals(expectedResult,actualResult);
//
//    }
//
//    @Test
//    public void verify_when_input_is_00(){
//
//    }


}
