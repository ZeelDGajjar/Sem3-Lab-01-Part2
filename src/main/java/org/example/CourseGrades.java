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
        return "Lab Score: " + grades[0].getscore() + "%5s Grade: " + grades[0].getGrade()
                + "\nPass/Fail Exam Score: " + grades[1].getscore() + "Grade: " + grades[0].getGrade()
                + "\nEssay Score:" + grades[2].getscore() + "Grade: " + grades[2].getGrade()
                + "\nFinal Exam Score:" + grades[3].getscore() + "Grade: " + grades[3].getGrade();
    }
}
