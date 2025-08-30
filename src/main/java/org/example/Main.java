package org.example;

import java.util.Scanner;

/**
 *
 * @author 2474008
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //-------- Task 2 --------
        System.out.print("-------- Task 2 --------");
        System.out.print("How many questions are on the final exam? ");
        int finalScore = Integer.parseInt(input.nextLine());
        System.out.print("How many questions did the student miss? ");
        int numQuestions = Integer.parseInt(input.nextLine());

        FinalExam exam1 = new FinalExam(finalScore, numQuestions);
        System.out.printf("Each question counts %.1f points. \n", exam1.getPointsEach());
        System.out.printf("The exam score is %.1f \n", exam1.getscore());
        System.out.printf("The exam grade is %s \n", exam1.getGrade());

        //------- Task 3 --------
        System.out.print("------- Task 3 --------");
        System.out.print("How many questions are on the final exam? ");
        int finalScore1 = Integer.parseInt(input.nextLine());
        System.out.print("How many questions did the student miss? ");
        int numQuestions1 = Integer.parseInt(input.nextLine());
        System.out.print("What is the minimum score? ");
        int minScore = Integer.parseInt(input.nextLine());

        PassFailExam exam2 = new PassFailExam(finalScore1, numQuestions1, minScore);
        System.out.printf("Each question counts %.1f points. \n", exam2.getPointsEach());
        System.out.printf("The exam score is %.1f \n", exam2.getscore());
        System.out.printf("The exam grade is %s \n", exam2.getGrade());
    }
}