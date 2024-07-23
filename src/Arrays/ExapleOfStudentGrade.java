package Arrays;
class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }


    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.length;
    }


    @Override
    public String toString() {
        return name + ": Average Grade = " + String.format("%.2f", getAverageGrade());
    }


    public int getHighestGrade() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public int getLowestGrade() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}

class Course {
    private static Student[] students = new Student[100];
    private static int studentCount = 0;

    public static void addStudent(Student student) {
        if (studentCount < 100) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Course is full. Cannot add more students.");
        }
    }


    public static int getHighestGrade() {
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < studentCount; i++) {
            int studentHighest = students[i].getHighestGrade();
            if (studentHighest > highest) {
                highest = studentHighest;
            }
        }
        return highest;
    }


    public static int getLowestGrade() {
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < studentCount; i++) {
            int studentLowest = students[i].getLowestGrade();
            if (studentLowest < lowest) {
                lowest = studentLowest;
            }
        }
        return lowest;
    }


    public static void printStudentDetails() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }
}

public class ExapleOfStudentGrade {
    public static void main(String[] args) {

        Student s1 = new Student("Alice", new int[]{85, 90, 92});
        Student s2 = new Student("Bob", new int[]{78, 82, 88});
        Student s3 = new Student("Charlie", new int[]{95, 93, 97});


        Course.addStudent(s1);
        Course.addStudent(s2);
        Course.addStudent(s3);


        Course.printStudentDetails();


        System.out.println("Highest Grade: " + Course.getHighestGrade());
        System.out.println("Lowest Grade: " + Course.getLowestGrade());
    }
}
