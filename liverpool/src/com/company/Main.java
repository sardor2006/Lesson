package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 23;
        int[] arr = {6, 25, 91, 23, 72, 9, 18, 6};
        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (arr[i] == n) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }

}
