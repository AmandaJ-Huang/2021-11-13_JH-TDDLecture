import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMainApplication {
    /* Given: an array of numbers as strings, i.e., {"1", "5", "15", "9", "4"}
    Task: sort the numbers
    Restriction: the numbers must stay strings - no converting to integers

    Result -- return an array of string numbers in the proper order: lowest --> highest 1, 4, 5, 9, 15

    Expected: {"1", "4", "5", "9", "15"}

     */
    private MainApplication main = new MainApplication();


    @Test
    public void testWithPositives() {
        //Given
        String[] given = {"1", "5", "15", "9", "4"};
        String[] expected = {"1", "4", "5", "9", "15"};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

//    @Test
//    public void testWithNegatives() {
//        //Given
//        String[] given = {"-2", "1", "5", "15", "9", "4"};
//        String[] expected = {"-2", "1", "4", "5", "9", "15"};
//
//        //When
//        String[] actual = main.sortArray(given);
//
//        //Then
//        assertArrayEquals(expected, actual);
//    }

    /*
    Sub-method test current less than previous
     */
    @Test
    public void currentIsLessThanPrevious_True() {
        //Given
        String[] given = {"5", "1"};
        Boolean expected = true;

        //When
        Boolean actual = main.currentIsLessThanPrevious(given[1], given[0]);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void currentIsLessThanPrevious_False() {
        //Given
        String[] given = {"1", "5"};
        Boolean expected = false;

        //When
        Boolean actual = main.currentIsLessThanPrevious(given[1], given[0]);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void currentIsLessThanPrevious_WhenEqual() {
        //Given
        String[] given = {"1", "1"};
        Boolean expected = false;

        //When
        Boolean actual = main.currentIsLessThanPrevious(given[1], given[1]);

        //Then
        assertEquals(expected, actual);
    }
}
