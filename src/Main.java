import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// piemérs A
        //    int num = 5;
        //  for (int i = 1; i <= num; i++) {
        //    for (int a = 1; a <= i; a++) {
        //      System.out.print("*");
        //}
        //   System.out.println();
        // }


// Piemérs B

        //   int rows = 5, k = 0;

        //   for (int i = 1; i <= rows; ++i, k = 0) {
        //      for (int space = 1; space <= rows - i; ++space) {
        //     System.out.print("  ");
        //    }

        //    while (k != 2 * i - 1) {
        //      System.out.print("* ");
        //       ++k;
        //     }


        //        System.out.println();

        //   }
        // Piemérs C

        //int rows = 5;

        //for (int i = rows; i >= 1; --i) {
          //  for (int space = 1; space <= rows - i; ++space) {
            //   System.out.print("  ");
            //}

         // for (int j = i; j <= 2 * i - 1; ++j) {
           //    System.out.print("* ");
            // }

            //for (int j = 0; j < i - 1; ++j) {
              //   System.out.print("* ");
             //}

             //System.out.println();
           //}

// Piemérs D

    //    int size = 5;
      //  int num = 1;
        //for (int i = 0; i < size; i++) {
        //    for (int j = 0; j < size-i-1; j++) {
         //       System.out.print(" ");
       //     }
       //     for (int k = 0; k < 2*i+1; k++) {
        //        System.out.print(num++);
        //    }
        //    num = 1;
     //       System.out.println();
      //  }



        // Piemérs E

        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (size - i) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}






