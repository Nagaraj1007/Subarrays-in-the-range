import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[] subArrays(int array[], int start, int stop){
        return Arrays.copyOfRange(array, start, stop + 1);
    }

    public static void main(String[] args) {
       int subArray[] = subArrays(new int[]{4,2,2}, 0, 1);
       for (int values : subArray){
           System.out.print(values + " ");
       }
    }
}