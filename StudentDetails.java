import java.util.Scanner;

// Base class Student
class Student {
    int roll;

    // Method to get roll number from user
    public void getRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
    }

    // Method to display roll number
    public void putRoll() {
        System.out.println("Roll Number: " + roll);
    }
}

// Subclass Test extending Student
class Test extends Student {
    double sub1, sub2;

    // Method to get marks of two subjects from user
    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        sub1 = sc.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        sub2 = sc.nextDouble();
    }

    // Method to display marks of subjects
    public void putMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Interface Attendance
interface Attendance {
    void putAttendance();
}

// Result class extending Test and implementing Attendance interface
class Result extends Test implements Attendance {
    double atten, total;

    // Method to get and display attendance from user
    public void putAttendance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Attendance Marks: ");
        atten = sc.nextDouble();
        System.out.println("Attendance Marks: " + atten);
    }

    // Method to calculate total marks (sub1 + sub2 + atten)
    public void marksAdd() {
        total = sub1 + sub2 + atten;
    }

    // Method to display roll, marks, and total
    public void display() {
        putRoll();
        putMarks();
        System.out.println("Total Marks (sub1 + sub2 + attendance): " + total);
    }
}

// Main class to test the program
public class StudentDetails {
    public static void main(String[] args) {
        // Create an object of the Result class
        Result r = new Result();

        // Get and display roll number
        r.getRoll();

        // Get marks of two subjects from user
        r.getMarks();

        // Display attendance marks, calculate total, and display all data
        r.putAttendance();
        r.marksAdd();
        r.display();
    }
}
