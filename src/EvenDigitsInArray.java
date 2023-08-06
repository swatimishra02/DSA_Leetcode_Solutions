// Leetcode: 1295. Find Numbers with Even Number of Digits  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.Scanner;

public class EvenDigitsInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {12,345,2,6,7896};
        FindEven(arr);
    }
    static int FindEven(int[] arr){
        int count = 0;
        for(int i:arr){
            while(i!=0){
                i=i/10;
                count++;
            }
            if(i%2==0){
                return count;
            }
        }
        return count;
    }
}
