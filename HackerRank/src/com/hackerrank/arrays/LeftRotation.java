package com.hackerrank.arrays;

import java.io.IOException;
import java.util.Scanner;

public class LeftRotation {

	static int[] rotLeft(int[] a, int d) {
        int[] newA = new int[a.length];
        int newAIndex=0;
        for(int i=d;i<a.length;i++) {
            newA[newAIndex]=a[i];
            newAIndex++;
        }
        for(int i=0;i<d;i++) {
            newA[newAIndex]=a[i];
            newAIndex++;
        }
        return newA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int[] result = rotLeft(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        scanner.close();
    }
}