import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String grade;
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
    }
}

class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Display Students\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    String grade = sc.next();
                    students.add(new Student(name, roll, grade));
                    break;
                case 2:
                    System.out.print("Enter Roll Number to remove: ");
                    int rollToRemove = sc.nextInt();
                    students.removeIf(s -> s.rollNumber == rollToRemove);
                    System.out.println("Student removed.");
                    break;
                case 3:
                    System.out.println("Student List:");
                    for (Student s : students) s.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}