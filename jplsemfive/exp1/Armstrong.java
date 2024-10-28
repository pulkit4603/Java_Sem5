package jplsemfive.exp1;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the upper bound: ");
        Scanner sc = new Scanner(System.in);
        int upperBound = sc.nextInt();
        int count = 0;

        boolean[] isPrime = primesUnderN(upperBound);

        System.out.println("\nPrime numbers under " + upperBound + " are: ");
        for (int i = 2; i <= upperBound; i++){
            if (isPrime[i] == true) {
                System.out.println(i + " "); 
                count++;
            }
        }

        System.out.println("\nHence there are " + count + " primes under " + upperBound);
        
        System.out.println("\nArmstrong numbers under " + upperBound + " are: ");
        for (int i = 0; i <= upperBound; i++){
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean[] primesUnderN(int n) {
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        
        for (int i = 2; i*i <= n; i++){
            if (isPrime[i] == true){
                for (int j = i*i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        boolean isArmstrong = false;
        int sum = 0;

        while (n!=0){
            int currDigit = n%10;
            sum += (int) Math.pow(currDigit, 3);
            n /= 10;
        }

        isArmstrong = (sum == original);
        return isArmstrong;
    }
}
