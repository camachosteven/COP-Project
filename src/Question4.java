/**
   Team Leader: Steven Camacho, 6128597, U01
   Student: Christopher Hinchey, 6126648, U01
   Student: Juan Arias, 6119395, U01
   
    Exercise 7.7 from section Programming Projects in Chapter 7, page 366 in our textbook.  
 */

// Question #4: Theater Seating Prices

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Question4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat normal = new DecimalFormat();
        int theater[][] = new int[9][10];
        
        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[0].length; j++) {
                if (i <= 2) theater[i][j] = 10;
                else if (i > 2 && i <= 5) {
                    if (j > 1 && j < 10) theater[i][j] = 20;
                    else theater[i][j] = 10;
                } else if (i == 6) {
                    if (j == 4 || j == 5) theater[i][j] = 40;
                    else if ((j > 1 && j < 4) || (j > 5 && j < 8)) theater[i][j] = 30;
                    else theater[i][j] = 20;
                } else if (i == 7) {
                    if (j == 4 || j == 5) theater[i][j] = 50;
                    else if(j == 3 || j == 6) theater[i][j] = 40;
                    else if (j == 1 || j == 2 || j == 7 || j == 8) theater[i][j] = 30;
                    else theater[i][j] = 20;
                } else {
                    if (j > 1 && j < 8) theater[i][j] = 50;
                    else if (j == 1 || j == 8) theater[i][j] = 40;
                    else theater[i][j] = 30;
                }
                
                System.out.print(theater[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
}