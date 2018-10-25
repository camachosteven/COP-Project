/**
   Team Leader: Steven Camacho, 6128597, U01
   Student: Christopher Hinchey
   Student: 
 */

import java.util.Random;

public class Question1 {
    public static void main(String args[]) {
        Random random = new Random();
        int numbers[] = new int[20];
        String randomNumbers = "";
        
        for (int i = 0; i < 20; i++) {
            numbers[i] = 1 + random.nextInt(6);
        }
        
/*      for (int i = 0; i < 20; i++) {
            if (i == 0) {
                if (numbers[i] == numbers[i + 1]) randomNumbers = randomNumbers + "(" + numbers[i] + " ";
                else randomNumbers = randomNumbers + numbers[i] + " ";
            } else if (numbers[i] == numbers[i + 1]) {
                if (numbers[i] != numbers[i - 1]) randomNumbers = randomNumbers + "(" + numbers[i] + " ";
                else randomNumbers = randomNumbers + numbers[i] + " ";
            } else if (numbers[i] != numbers[i + 1]) {
                if (numbers[i] == numbers[i - 1]) randomNumbers = randomNumbers + numbers[i] + ") ";
                else randomNumbers = randomNumbers + numbers[i] + " ";
            } else {
                randomNumbers = randomNumbers + numbers[i] + " ";
            }
        } */
        
        System.out.println("");
    }
}