/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author 2474008
 */
public class PassFailExam extends PassFailActivtiy{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPointsEach) {
        super();
        this.numQuestions = numQuestions;
        this.pointsEach = 100.0 / numQuestions;
        this.numMissed = numMissed;
        this.setScore(100.0 - (numMissed * pointsEach));
    }

    public double getPointsEach() {

        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
