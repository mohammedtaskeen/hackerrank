package com.hackerrank.warmup;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

    // Complete the sockMerchant function below.
    @SuppressWarnings("rawtypes")
	static int sockMerchant(int n, int[] ar) {
    	
    	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int i: ar) {
            if(hmap.containsKey(Integer.valueOf(i))) {
                hmap.put(Integer.valueOf(i), hmap.get(Integer.valueOf(i))+1);
            } else {
                hmap.put(Integer.valueOf(i),1);
            }
        }
        int noOfPairs = 0;
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            noOfPairs += (Integer) mentry.getValue()/2;
        }
        return noOfPairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
        scanner.close();
    }
}
