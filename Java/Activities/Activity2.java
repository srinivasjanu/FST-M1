package activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args){
        int[] array = {10, 77, 10, 54, -11, 10};
        System.out.println("Original values : "+ Arrays.toString(array));

        int Search_number = 10;
        int final_value = 30;
        System.out.println("Result: "+ result(array, Search_number, final_value));
    }

    public static boolean result(int[] i, int searchNum, int finalSum) {
        int temp = 0;
        for (int j : i) {
            if (j == searchNum) {
                temp += searchNum;
            }
            if (temp > finalSum) {
                break;
            }
        }
        return temp == finalSum;
    }
}

