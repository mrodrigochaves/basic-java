package edu.mrodrigochaves.average;

public class SchoolReport {

    public static void main(String[] args) {
        int finalAverage = 7;
        if (finalAverage < 6)
            System.out.println("You have been disapproved!");
        else if (finalAverage == 6)
            System.out.println("You need retake test!");
        else
            System.out.println("Approved!");
        
    }
    
}
