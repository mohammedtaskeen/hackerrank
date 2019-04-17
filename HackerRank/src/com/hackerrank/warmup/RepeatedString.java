package com.hackerrank.warmup;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long noOfCompleteString = n / s.length();
        long noOfa = 0;
        for(char c: s.toCharArray()) {
        	if(c=='a') noOfa++;
        }
        noOfa *= noOfCompleteString;
        int remainingChars = (int) (n - (noOfCompleteString*s.length()));
        for(char c: s.substring(0, remainingChars).toCharArray()) {
        	if(c=='a') noOfa++;
        }
        return noOfa;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//        bufferedWriter.close();
        
        System.out.println(result);
        scanner.close();
    }
}
