package org.example;

import java.util.Arrays;

public class CourseGrades {
    private GradedActivity[] grades;
    private final int NUM_GRADES = 4;

    public CourseGrades() {
        grades = new GradedActivity[NUM_GRADES];
    }

    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }

    public void setPassFail(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }

    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }

    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%-5s %-12.1fGrade: %s%n",
                "Lab Score:", grades[0].getScore(), grades[0].getGrade()));

        sb.append(String.format("%-5s %-8.1fGrade: %s%n",
                "Pass/Fail Exam Score:", grades[1].getScore(), grades[1].getGrade()));

        sb.append(String.format("%-5s %-10.1fGrade: %s%n",
                "Essay Score:", grades[2].getScore(), grades[2].getGrade()));

        sb.append(String.format("%-5s %-5.1fGrade: %s%n",
                "Final Exam Score:", grades[3].getScore(), grades[3].getGrade()));

        return sb.toString();
    }
}
