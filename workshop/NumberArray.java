package com.bridgelabs.workshop;

public class NumberArray {
    public void missingNum(int[] array1,int[] array2) {


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (i != j) {
                    int result = array1[i];
                    System.out.println(i + " ");
                    break;
                } else {
                    System.out.println(i + " ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 3, 5, 6, 0, 0};
        NumberArray obj = new NumberArray();
        obj.missingNum(array1,array2);
    }
}
