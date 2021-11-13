import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {

    }

    public String[] sortArray(String[] input) {
        /*
        Check each element
        Compare one to the next via ASCII table
        Set smallest variable to the first element,
            compare to 2nd and swap if 2nd is smaller (bubble sort)
         */
        String smallestValue = input[0];
        /*wrap the for loop in a while loop
        while boolean !sorted
         */
        Boolean sorted = false;

        while(!sorted) {
            sorted = true;
            for (int i = 1; i < input.length; i++) {

//                if ((input[i].length() == input[i - 1].length()
//                        && input[i].compareTo(input[i - 1]) < 0)
//                    || input[i].length() < input[i - 1].length()) {
//                if (input[i].length() < input[i - 1].length()) {
//                    String temp = input[i];
//                    input[i] = input[i - 1];
//                    input[i - 1] = temp;
//                    sorted = false;
//                }
                if (currentIsLessThanPrevious(input[i], input[i-1])) {
                    String temp = input[i];
                    input[i] = input[i - 1];
                    input[i - 1] = temp;
                    sorted = false;
                }

            }
        }
        return input;
    }

    /*
    Sub-method to see if current is less than previous
     */
    public Boolean currentIsLessThanPrevious(String current, String previous) {
        if (current.length() < previous.length()) {
            return true;
        } else if (current.length() > previous.length()) {
            return false;
        } else if (current.compareTo(previous) < 0) {
            return true;
        }
        return false;
    }
}
