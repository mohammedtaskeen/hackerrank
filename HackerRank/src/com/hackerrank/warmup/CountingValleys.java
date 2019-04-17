package com.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int noOfValleys = 0;
    	int currentSum = 0;
    	boolean belowSeaLevel = false;
    	for(int c: s.toCharArray()) {
    		if(c=='D') currentSum--;
    		else if (c=='U') currentSum++;
    		if(currentSum<0 && !belowSeaLevel) { // now entering a valley, increment noOfValleys & set belowSeaLevel
    			belowSeaLevel = true;
    			noOfValleys++;
    		} else if(currentSum>=0) { // now entering a valley, increment noOfValleys & set belowSeaLevel
    			belowSeaLevel = false;
    		}
    	}
    	
		return noOfValleys;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        System.out.println(result);
        scanner.close();
    }
}

