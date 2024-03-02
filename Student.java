package studentdatabaseapp; // Declaring the package name

import java.util.Scanner; // Importing Scanner class from java.util package

public class Student { // Declaring the class named Student

    // Instance variables
    private String firstName; // Declaring a variable to store the first name of the student
    private String lastName; // Declaring a variable to store the last name of the student
    private int gradeYear; // Declaring a variable to store the grade year of the student
    private String studentID; // Declaring a variable to store the student ID
    private String courses; // Declaring a variable to store the courses of the student (not implemented)
    private int tuitionBalance =0; // Declaring a variable to store the tuition balance of the student
    private static int costOfCourse = 600; // Declaring a static variable to store the cost of each course
    private static int id = 1000; // Declaring a static variable to store the base ID for generating unique student IDs

    // Constructor to initialize a new Student object
    public Student() {
    	
        Scanner in = new Scanner(System.in); // Creating a Scanner object to read input from the user

        // Prompting the user to input student details
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine(); // Reading and storing the first name entered by the user

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine(); // Reading and storing the last name entered by the user

        // Prompting the user to input the grade year and reading it
        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt(); // Reading and storing the grade year entered by the user

        setStudentID(); // Calling the setStudentID() method to generate the student ID
        this.courses = "";
        // Printing the student's details
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    // Method to generate a unique student ID
    private void setStudentID() {
        id++; // Incrementing the static id variable
        this.studentID = gradeYear + "" + id; // Combining gradeYear and id to generate the student ID
    }

    // Enroll in courses
    public void enroll() {
    	// Get inside a loop, user hits 0
    	do {
	    	System.out.print("Enter course to enroll ( Q to quit): ");
	    	Scanner in = new Scanner(System.in);
	    	String course = in.nextLine();
	    	if (!course.equals("Q")) {
	    		courses = courses + "\n" + course;
	    		tuitionBalance = tuitionBalance + costOfCourse;
	    	}
	    	else { 
	    		break; 
	    		}
    	} while (1 != 0);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }
	
 	// View balance
    public void viewBalance() {
    	System.out.println("Your balance is: $" + tuitionBalance);
    }
 	
 	// Pay tuition
    public void payTuition() {
    	viewBalance();
    	System.out.print("Enter your payment: $");
    	Scanner in = new Scanner(System.in);
    	int payment = in.nextInt();
    	tuitionBalance = tuitionBalance - payment;
    	System.out.println("Thank You For Your Payment Of $" + payment);
    	viewBalance();
    }
 	
 	// Show status
    public String toString() {
    	return "Name: " + firstName + " " + lastName + 
    			"\nCourses Enrolled:" + courses + 
    			"\nBalance: $" + tuitionBalance;
    }
}
