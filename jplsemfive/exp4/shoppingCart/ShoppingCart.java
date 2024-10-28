package jplsemfive.exp4.shoppingCart;

import java.util.*;

public class ShoppingCart {
    public static int numCarts = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][][] shoppingCart = new int[numCarts][2][];

        for (int i=0; i<numCarts; i++){
            System.out.println("Cart number " + (i+1) + ":");
            for (int j=0; j<2; j++){
                if (j == 0){
                    System.out.print("Enter the number of non-perishable items: ");
                    int numNonPerish = scanner.nextInt();
                    shoppingCart[i][j] = new int[numNonPerish];
                    for (int k = 0; k < numNonPerish; k++){
                        System.out.print("Enter price of non-perishable item " + (k+1) + " in cart number " + (i+1) + ": ");
                        shoppingCart[i][j][k] = scanner.nextInt();
                    }
                }
                else {
                    System.out.print("Enter the number of perishable items: ");
                    int numPerish = scanner.nextInt();
                    shoppingCart[i][j] = new int[numPerish];
                    for (int k = 0; k < numPerish; k++){
                        System.out.print("Enter price of perishable item " + (k+1) + " in cart number " + (i+1) + ": ");
                        shoppingCart[i][j][k] = scanner.nextInt();
                    }
                }
            }
        }

        for (int cart = 0; cart < numCarts; cart++){
            System.out.println("Total cost of all items in cart no. " + (cart+1) + " is: " + totalAllItems(shoppingCart)[cart]);
        }

        System.out.println("Most expensive non-perishable item: " + maxNonPerishable(shoppingCart));

        System.out.println("Sum of prices of all perishable items: " + totalPerishable(shoppingCart));
    }

    public static int maxNonPerishable(int[][][] cart) {
        int sum = 0;
        for (int i=0; i<numCarts; i++) {
            for (int j=0; j<cart[i][0].length; j++) {
                sum = Math.max(cart[i][0][j], sum);
            }
        }
        return sum;
    }
    
    public static int totalPerishable(int[][][] cart) {
        int sum = 0;
        for (int i=0; i<numCarts; i++) {
            for (int j=0; j<cart[i][1].length; j++) {
                sum += cart[i][1][j];
            }
        }
        return sum;
    }

    public static int[] totalAllItems(int[][][] cart) {
        int[] sum = new int[3];
        for (int i=0; i<numCarts; i++) {
            for (int j=0; j<cart[i][0].length; j++) {
                sum[i] += cart[i][0][j];
            }
            for (int j=0; j<cart[i][1].length; j++) {
                sum[i] += cart[i][1][j];
            }
        }
        return sum;
    }
}
