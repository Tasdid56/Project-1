package attendancemanagementsystem;
import java.util.*;
class Student {
    String name;
    int id;
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Attendance {
    int studentId;
    String status;
    Attendance(int studentId, String status) {
        this.studentId = studentId;
        this.status = status;
    }
    int getStudentId() {
        return studentId;
    }
    String getStatus() {
        return status;
    }
}
public class AttendanceManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Attendance> attendanceList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Attendance Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Show Report");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine();
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                students.add(new Student(name, id));
                System.out.println("Student Added Successfully!");
            }
            else if (choice == 2) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Attendance (Present/Absent): ");
                String status = sc.next();
                attendanceList.add(new Attendance(id, status));
                System.out.println("Attendance Marked Successfully!");
            }
            else if (choice == 3) {
                System.out.println("\n===== Attendance Report =====");
                for (Attendance a : attendanceList) {
                    System.out.println(
                            "Student ID: " + a.getStudentId()
                            + " | Status: " + a.getStatus());
                }
            }
            else if (choice == 4) {
                System.out.println("Program Closed.");
                break;
            }
            else {
                System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}