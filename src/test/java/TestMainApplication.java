import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMainApplication {
    /*
    Given: an array of numbers as strings, i.e., {"1", "5", "15", "9", "4"}
    Task: sort the numbers
    Restriction: the numbers must stay strings - no converting to integers
    Rule (edge cases - less common cases, but may require code to account for them):
        - null values should be removed prior to sorting
        - your method should be able to account for null arrays
        - empty string should be sorted as if they were at 0
        -

    Result: return an array of string numbers in the proper order: lowest --> highest 1, 4, 5, 9, 15

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

    @Test
    public void testWithNegatives() {
        //Given
        String[] given = {"-2", "1", "5", "15", "9", "4"};
        String[] expected = {"-2", "1", "4", "5", "9", "15"};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithDecimals() {
        //Given
        String[] given = {"2.0", "1", "5", "15", "9", "4"};
        String[] expected = {"1", "2.0", "4", "5", "9", "15"};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithLeadingZeros() {
        //Given
        String[] given = {"007", "1", "5", "15", "9", "4"};
        String[] expected = {"1", "4", "5", "007", "9", "15"};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithLowerCaseCharacter() {
        //Given
        String[] given = {"c", "1", "5", "15", "9", "4"};
        String[] expected = {"1", "4", "5", "9", "15"};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    /*
        solvable?
     */
//    @Test
//    public void testWithNumberWord() {
//        //Given
//        String[] given = {"Six", "1", "5", "15", "9", "4"};
//        String[] expected = {"1", "4", "5", "Six", "9", "15"};
//
//        //When
//        String[] actual = main.sortArray(given);
//
//        //Then
//        assertArrayEquals(expected, actual);
//    }

    @Test
    public void testWithEmptyString() {
        //Given
        String[] given = {"1", "", "15", "9", "4"};
        String[] expected = {"", "1", "4", "9", "15"};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithEmptyStringIsNull() {
        //Given
        String[] given = {"1", null, "15", "9", "4"};
        String[] expected = {"1", "4", "9", "15"};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithNullList() {
        //Given
        String[] given = null;
        String[] expected = null;

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithLengthOneArray() {
        //Given
        String[] given = {"42"};
        String[] expected = {"42"};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithLengthZeroArray() {
        //Given
        String[] given = {};
        String[] expected = {};

        //When
        String[] actual = main.sortArray(given);

        //Then
        assertArrayEquals(expected, actual);
    }

    /*
    To solve later
     */
//    @Test
//    public void testWithNoStringsInArray() {
//        //Given
//        Integer[] given = {42};
//        String[] expected = {"42"};
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
