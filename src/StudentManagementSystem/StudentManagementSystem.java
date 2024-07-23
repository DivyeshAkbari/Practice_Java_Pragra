package StudentManagementSystem;
public class StudentManagementSystem {
    public static void main(String[] args) {

        Student1 s1 = new Student1("Alice", 45, 1234, "Java", new double[]{85, 90, 92});
        Student1 s2 = new Student1("Bob", 48, 5678, "python", new double[]{78, 82, 88});
        Student1 s3 = new Student1("Charlie", 50, 9101, ".net", new double[]{95, 93, 97});


        StudentManager mgr = new StudentManager();
        mgr.addStudent(s1);
        mgr.addStudent(s2);
        mgr.addStudent(s3);


        Student1 foundStudent = mgr.findByRollNumber();
        if (foundStudent != null) {
            System.out.println("Student Found:");
            foundStudent.displayInfo();
        } else {
            System.out.println("Student not found");
        }

        boolean removed = mgr.removeStudentByRollNumber();
        if (removed)
        {
            System.out.println("Student removed successfully");
        }
        else
        {
            System.out.println("Student not found");
        }

        mgr.displayStudentDetails();

        Student1 topStudent = mgr.findStudentWithHighestGrades();
        if (topStudent != null)
        {
            System.out.println("Student with the highest grades:");
            topStudent.displayInfo();
        }
        else
        {
            System.out.println("No students available");
        }
    }
}