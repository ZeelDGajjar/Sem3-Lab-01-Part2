/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author 2474008
 */
public class GradedActivity {
    private double score;
    
    public GradedActivity() {}
    
    public GradedActivity(double score) {
        this.score = score;
    }
    
    public void setScore(double s) {
        this.score = s;
    }
    
    public double getscore() {
        return this.score;
    }
    
     public char getGrade() {
         return (score >= 90)? 'A' : ((score >= 80)? 'B' : ((score >= 70)? 'C' : ((score >= 60)? 'D' : 'F')));
    }
}
