// William Hercules
// COMP110
// Project 3

import java.util.*;

public class Project3 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        String linesArg;

        // Input Part 1 
                if (args.length == 0) {
            System.out.println("Enter the number of lines to type:");
            linesArg = input.nextLine();
        } else {
            linesArg = args[0];
        }

            Scanner textScanner = new Scanner(linesArg);

        int numLines;
        if (!textScanner.hasNextInt()) {
            System.out.println("Error: Non-integer input.");
            return;
        } else {
            numLines = textScanner.nextInt();
            if (numLines < 1 || numLines > 5) {
                System.out.println("Error: Invalid integer number.");
                return;
            }
        }
        //Input Part 2
        String[][] paragraph = new String[numLines][]; 
                for (int i = 0; i < numLines; i++) {
            System.out.println("Line " + i + ":");
            String line = input.nextLine();
            String[] words = line.split("\\s");
            paragraph[i] = words;
        }

        
        for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
                System.out.print(paragraph[i][j] + "/");
            }
            System.out.println();
        }

        //Calculation Part 1  
                for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
                paragraph[i][j] = String.format("%-10s", paragraph[i][j]);
            }
        }
        for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
                System.out.print(paragraph[i][j] + "/");
            }
            System.out.println();
        }
        //Calculation Part 2
                for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
                String w = paragraph[i][j];
                
            paragraph[i][j] = w.substring(0, 10);
            }
        }

        for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
                System.out.print(paragraph[i][j] + "/");
            }
            System.out.println();
        }
         // Sorting Line    
          for (int i = 0; i < paragraph.length; i++) {
            String[] line = paragraph[i];
            for (int j = 0; j < line.length - 1; j++) {
                for (int k = j + 1; k < line.length; k++) {
                    if (line[j].compareToIgnoreCase(line[k]) > 0) {
                        String temp = line[j];
                        line[j] = line[k];
                        line[k] = temp;
                    }
                }
            }
        }

        //Final Output
        for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
                System.out.print(paragraph[i][j] + "/");
            }
            System.out.println();
        }
    }
}
//wegonebeokayy
