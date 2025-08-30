package org.example;

public class Essay extends GradedActivity {
    private double grammer;
    private double spelling;
    private double correctLength;
    private double content;

    public void setScore(double grammer, double spelling, double correctLength, double content) {
        double score = this.grammer + this.spelling + this.correctLength + this.content;
        super.setScore(score);
    }

    public void setGrammer(double grammer) {
        this.grammer = grammer;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public void setContent(double content) {
        this.content = content;
    }

    public double getGrammer() {
        return grammer;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getScore() {
        return super.getscore();
    }
}
