package Vonglap.Baitap2;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = check.nextInt();
        int i = 2;
        int count = 0;
        while( count < number) {
            int j = 2;
            while( j < i) {
                if (i % j == 0) {
                    break;
                } else {
                    j++;
                }
            }
            if( j == i) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
