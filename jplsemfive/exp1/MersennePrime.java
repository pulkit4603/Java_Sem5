package jplsemfive.exp1;

import java.util.Scanner;

public class MersennePrime {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int mersenne = (int) Math.pow(2, num) - 1;

        if (isPrime(mersenne)) {
            System.out.println("The number " + mersenne + " (= 2^" + num + " - 1) is a Mersenne Prime");
        } else {
            System.out.println("The number is not a Mersenne Prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
