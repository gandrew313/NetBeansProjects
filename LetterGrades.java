/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author AndrewGertz
 */
import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n", 
                "Enter grades between 0-100",
                "Type the end of file indicator to terminate",
                "On Unix/Linux/macOS type <Ctrl> d then press enter",
                "On Windows type <Ctrl> z then press enter");
        
        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;
            
            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }
                System.out.printf("%nGrade report:%n");
                
                
                if (gradeCounter != 0) {
                    
                    double average = (double) total / gradeCounter;
                       System.out.printf("Total of the %d grades entered is %d%n",
                               gradeCounter, total);
                       System.out.printf("Class average is %,2f%n");
                       System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n",
                               "Number of students who received each grade:",
                               "A: ", aCount,
                               "B: ", bCount,
                               "C: ", cCount,
                               "D: ", dCount,
                               "F: ", fCount);
                }
                
                else {
                    System.out.printf("No grades were entered");                                                                                                                                                                 
            }
        }
    }

