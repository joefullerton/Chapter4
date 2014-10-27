package Chapter_4;
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data 
	private String Name;
	private double test1,test2,average;
	
	Scanner scan = new Scanner(System.in);

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
	//add body of constructor
    Name = studentName;
    	
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
	//add body of inputGrades
    System.out.println("Enter " + Name + "'s Score on Test 1");
    test1 = scan.nextDouble();
    System.out.println("Enter " + Name + "'s Score on Test 2");
    test2 = scan.nextDouble();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //----------------------------------------------- 
    public double getAverage()
    //add header for getAverage
    {
	//add body of getAverage
    average = (test1 + test2)/2;
    return average;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    public String getName()

    //add header for printName
    {
	//add body of printName
    return Name;
    }
    
    public String toString()
    {
    	return("Name: " + Name + "\tTest 1: " + test1 + "\tTest 2: " + test2 + "\tAverage: " + average);
    }

}