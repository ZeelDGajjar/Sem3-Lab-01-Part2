package org.example;

public class PassFailActivtiy extends GradedActivity {
    private double minPassingScore;

    public PassFailActivtiy(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    public char getGrade() {
        return (getscore() >= minPassingScore ? 'P' : 'F');
    }
}
