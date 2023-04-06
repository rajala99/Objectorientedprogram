package com.bridgelabs.workshop;


import java.util.Arrays;

public class Array {
    public void stringArray() {
        String[] arr = {"Aks hay", "Ar vi nd", "go pi"};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll(" ", "");
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Array obj = new Array();
        obj.stringArray();
    }
}

