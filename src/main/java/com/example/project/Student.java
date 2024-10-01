package com.example.project;

public class Student {
    // instance variables for 
    // first name (String)
    // last name (String)
    // graduation year (int)
    // sum of test scores (double).. should initialize at 0.0
    // test score count (int) ..should initialize at 0
    // highest test score (double).. should initialize at 0.0
    private String fName;
    private String lName;
    private int graduationYear;
    private double sumOfTestScores = 0;
    private int testScoreCount = 0;
    private double highestTestScore = 0.0;



    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        fName = firstName;
        lName = lastName;
        graduationYear = gradYear;

    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return fName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestTestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return testScoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return graduationYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        graduationYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        sumOfTestScores += newTestScore;
        testScoreCount ++;
        if (newTestScore > highestTestScore){
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        if (sumOfTestScores/testScoreCount >= 65) {
            return true;
        } else {
        return false;
        }
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        return sumOfTestScores/testScoreCount;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 