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

public class Question4 
{
    public static void main(String args[]) 
    {
        int row=0,col=0,row2=0,col2=0,price=0,search=0,total=0;
        String fin="YES";
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat normal = new DecimalFormat();
        int theater[][] = new int[9][10];
        int display [] [] = new int [9][10];
        
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
            }
        }

//Add loop here to refresh the "Display" for the price choice. Use varaible 'fin' to go along with the input code.

            total=0;
                for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display[0].length; j++) {
                if (i <= 2) display[i][j] = 10;
                else if (i > 2 && i <= 5) {
                    if (j > 1 && j < 10) display[i][j] = 20;
                    else display[i][j] = 10;
                } else if (i == 6) {
                    if (j == 4 || j == 5) display[i][j] = 40;
                    else if ((j > 1 && j < 4) || (j > 5 && j < 8)) display[i][j] = 30;
                    else display[i][j] = 20;
                } else if (i == 7) {
                    if (j == 4 || j == 5) display[i][j] = 50;
                    else if(j == 3 || j == 6) display[i][j] = 40;
                    else if (j == 1 || j == 2 || j == 7 || j == 8) display[i][j] = 30;
                    else display[i][j] = 20;
                } else {
                    if (j > 1 && j < 8) display[i][j] = 50;
                    else if (j == 1 || j == 8) display[i][j] = 40;
                    else display[i][j] = 30;
                }
            }
        }
        
        
        System.out.println("");
        
             for (int i=0; i<theater.length;i++)
             {
                 for (int j=0; j<theater[0].length;j++)
                 {
                     System.out.print(theater [i] [j] + " ");
                 }
                 System.out.println();
             } 
        //Start of user input
        System.out.println("");
        System.out.println("Do you want to pick a seat by location or price? \nEnter in either 'Location' or 'Price': ");
        String des=in.nextLine().toUpperCase();
        
        //Start of location input
        if (des.equals("LOCATION"))
        {
        System.out.print("\nPick the location of the seat you want. \nRow: ");
        row=in.nextInt()-1;                        //Subtracts 1 from the row so that the row starts at 0 if they put one
        System.out.print("Column: ");
        col=in.nextInt()-1;                        //Subtracts 1 from the col so that the row starts at 0 if they put one
        in.nextLine();
        //Determines if the seat is already taken
             if (theater [row][col]== 0)
            {
            System.out.println("This seat is unavaiable. Do you want to pick another one?"); 
            String answer= in.nextLine();
            in.nextLine();
            }
             
             //Asks if they want the ticket they put in the location for
                else
                {
                    price = theater [row][col];
                    System.out.println("The price of the ticket is $" + price);
                    System.out.println("");
                    System.out.println("Do you want to buy the ticket? \nEnter 'Yes' or ' No':");
                    String answer2= in.nextLine().toUpperCase();
                    
                
                     if (answer2.equals("YES"))
                        {
                         System.out.println("");
                         System.out.println("Thank you for the purchase!");
                         System.out.println("");
                         theater [row][col]=0;
                        }
                    if (answer2.equals("NO"))
                        {
                        System.out.println(""); //This might want to be included with the loop
                        }
                    
                }
        }
        
        
        ///Start of price input
        if (des.equals("PRICE"))
        {
            System.out.println("");
            System.out.print("Enter in the price of the ticket you are searching for: ");
            search=in.nextInt();
            
            
             for (int i=0; i<theater.length;i++)
             {
                 for (int j=0; j<theater[0].length;j++)
                 {
                    if (theater [i] [j] == search) 
                    {
                        total++; 
                    }
                 }
             }
             System.out.println("");
             System.out.println("There are " + total +" seat(s) avaible with that price.");
             System.out.println("");

             for (int i=0; i<display.length;i++)
             {
                 for (int j=0; j<display[0].length;j++)
                 {
                     
                     if (display [i] [j] != search)
                     {
                         display [i] [j]=0;
                     }
                     System.out.print(display [i] [j] + " ");
                 } 
                 System.out.println("");
             }
             
            System.out.print("\nPick the location of the seat you want. \nRow: ");
            row2=in.nextInt()-1;                        //Subtracts 1 from the row so that the row starts at 0 if they put one
            System.out.print("Column: ");
            col2=in.nextInt()-1;                        //Subtracts 1 from the col so that the row starts at 0 if they put one
            in.nextLine();
            
            theater [row2] [col2]=0;
            System.out.println("");
            System.out.println("Do you want to buy the ticket? \nEnter 'Yes' or ' No':");
            String answer3= in.nextLine().toUpperCase();
                if (answer3.equals("YES"))
                        {
                         System.out.println("");
                         System.out.println("Thank you for the purchase!");
                         System.out.println("");
                         theater [row][col]=0;
                        }
                    if (answer3.equals("NO"))
                        {
                        System.out.println(""); //This might want to be included with the loop
                        }
                    
            System.out.println("");
            System.out.println("Do you want to purchase another ticket? \nEnter in 'Yes' or 'No'");
            fin=in.nextLine().toUpperCase();
            System.out.println("");
        } 
        
    } 
}
