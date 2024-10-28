import java.util.*;

public class BookRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numBooks = 4;
        int[][] bookRating = new int[numBooks][];
        float[] avg = new float[numBooks];
        int mostPopular = 0;
        float count2 = 0;

        for(int i=0; i<numBooks; i++){
            int count = 0;
            System.out.print("Enter the number of readers: ");
            int numReaders = scanner.nextInt();
            bookRating[i] = new int[numReaders];
          
            for(int j=0; j<numReaders; j++){
                bookRating[i][j] = scanner.nextInt();
                count += bookRating[i][j];
            }
            if (numReaders >= 0) {
                avg[i] = (float) count / numReaders;
            }
        }

        for (int i=0; i<numBooks; i++){
            if (avg[i] >= count2){
                mostPopular = i + 1;
                count2 = avg[i];
            }
            System.out.println("Avg rating of book number " + (i+1)
            + " is " + avg[i] + "\n");
        }
        System.out.println("Most popular book is: " + mostPopular);
    }
}
