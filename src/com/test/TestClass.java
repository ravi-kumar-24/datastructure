package com.test;

import java.io.*;
import java.util.*;

/*
4
5,10 0,20 25,40 35,45

5,10
0,20
25,40
45,45
*/
public class TestClass {
    static int minParkingSpaces(int[][] parkingStartEndTimes) {
        // YOUR CODE HERE
        int count = 0, i=0, j=parkingStartEndTimes.length-1;

        //System.out.println("k length " + parkingStartEndTimes.length);
        for (int k = 0; k < parkingStartEndTimes.length ; k++) {
            for (int l = 0; l < parkingStartEndTimes[k].length ; l++) {
                System.out.print(parkingStartEndTimes[k][l]+" ");
            }
            System.out.println();
        }
        while(i<j){
            /*System.out.println("parkingStartEndTimes["+ i +"][0] "+parkingStartEndTimes[i][0]+
             " parkingStartEndTimes["+j+"][0] "+parkingStartEndTimes[j][0]+
                    " parkingStartEndTimes["+i+"][1] "+parkingStartEndTimes[i][1]+
                     " parkingStartEndTimes["+j+"][1] "+parkingStartEndTimes[j][1]);*/

            if((parkingStartEndTimes[i][0]<parkingStartEndTimes[j][0])
                    && (parkingStartEndTimes[i][1]<parkingStartEndTimes[j][1]) ){
                count++;
                i++;j--;
            }
            else{
                i++;
            }
        }
        return count;
    }

    // Returns minimum number of platforms reqquired
    static int findPlatform(int[][] parkingStartEndTimes)
    {
        int[] arr = new int[parkingStartEndTimes.length];
        int[] dep = new int[parkingStartEndTimes.length];
        for (int k = 0; k < parkingStartEndTimes.length ; k++) {
            for (int l = 0; l < parkingStartEndTimes[k].length ; l++) {

                arr[k] = parkingStartEndTimes[k][0];
                dep[k] = parkingStartEndTimes[k][1];
            }
        }
        // Sort arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = parkingStartEndTimes.length;
        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < n && j < n) {

            // If next event in sorted order is arrival,
            // increment count of platforms needed
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }

            // Else decrement count of platforms needed
            else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }

            // Update result if needed
            if (plat_needed > result)
                result = plat_needed;
        }

        return result;
    }


    int minParkingSpace(int[][] parkingTime){

        List<Integer> mymap = new ArrayList<>();

        for(int i=0;i<parkingTime.length;i++){
            mymap.add((parkingTime[i][0])++);
            mymap.add((parkingTime[i][1])--);
        }

        int ans=0;
        int count=0;
        for(int it=0;it!=mymap.size();++it){
            count+=it;
            ans=Math.max(ans,count);
        }
        return ans;
    }
    // DO NOT MODIFY ANYTHING BELOW THIS LINE!!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int[][] parkingStartEndTimeList = new int[n][2];
        String[] parkingStartEndTimes = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
            for (int j = 0; j < parkingStartEndTime.length; j++) {
                parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
            }
        }

        int out = findPlatform(parkingStartEndTimeList);
        System.out.println(out);

        wr.close();
        br.close();
    }
}
