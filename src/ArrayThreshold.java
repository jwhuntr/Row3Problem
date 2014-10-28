/**
 * Created by jahsh_000 on 10/28/2014.
 */
import java.util.Scanner;

public class ArrayThreshold {
  public static void main(String[] args) {
    Scanner   input      = new Scanner(System.in);
    final int ARR_SIZE = 100000;
    final int NUM_MAX  = 100;
    int[]     arr      = new int[ARR_SIZE];
    int[]     greaterArr;
    int       thrValue;

    // create a random array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * NUM_MAX) + 1;
    }

    // pick a threshold value
    System.out.print("Select a threshold value (1-" + (NUM_MAX - 1) + ": ");
    thrValue = input.nextInt();

    greaterArr = thresholdArray(arr, thrValue);

    System.out.print("{");
    for (int i = 0; i < greaterArr.length; i++) {
      System.out.print(greaterArr[i] + ",");
      if (i % 20 == 0) {
        System.out.println();
      }
    }
    System.out.print("}");

  }

  public static int[] thresholdArray(int[] array, int threshold) {
    int   num = 0;    // number of values greater than the threshold
    int   j = 0;      // counter for the greater array
    int[] greater;    // all numbers greater than the threshold value

    for (int i = 0; i < array.length; i++) {
      if (array[i] > threshold) {
        num++;
      }
    }

    greater = new int[num];

    for (int i = 0; i < array.length; i++) {
      if (array[i] > threshold) {
        greater[j] = array[i];
        j++;
      }
    }

    return greater;
  }
}