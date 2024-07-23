package StudentManagementSystem;

import java.util.Arrays;

class Student1 {

    private String name;
    private int age;
    private int rollnumber;
    private String course;
    private double [] grades;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public Student1(String name, int age, int rollnumber, String course, double [] grades) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }


    public double getHighestGrade()
    {
        double highest = grades[0];
        for (double grade : grades)
        {
            if (grade > highest)
            {
                highest = grade;
            }
        }
        return highest;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rollnumber: " + rollnumber);
        System.out.println("Course: " + course);
        System.out.println("Average: " + getAverageGrade());
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollnumber=" + rollnumber +
                ", course='" + course + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
