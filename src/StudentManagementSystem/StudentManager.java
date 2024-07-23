package StudentManagementSystem;

import java.util.Scanner;

class StudentManager {

   private  Student1[] student1s = new Student1[100];
   private int studentCount=0;

   Scanner sc = new Scanner(System.in);
   public void addStudent(Student1 student1)
   {
       if(studentCount<100)
       {
           student1s[studentCount] = student1;
           studentCount++;
       }
       else
       {
           System.out.println("Student is already in the list");
       }
   }

   public void displayStudentDetails()
   {
       System.out.println("Student Details");
       for(int i=0;i<studentCount;i++)
       {
           System.out.println(student1s[i]);
       }
   }

   public Student1 findByRollNumber()
   {
       System.out.println("Enter Roll Number");
       int rollNumber = sc.nextInt();


       for(int i=0;i<studentCount;i++)
       {
            if(student1s[i].getRollnumber()==rollNumber)
            {
                return student1s[i];
            }
       }
       return null;
   }


    public boolean removeStudentByRollNumber()
    {
        System.out.println("Enter Roll Number to remove");
        Scanner sc = new Scanner(System.in);
        int rollNumber = sc.nextInt();

        for (int i = 0; i < studentCount; i++)
        {
            if (student1s[i].getRollnumber() == rollNumber)
            {
                for (int j = i; j < studentCount - 1; j++)
                {
                    student1s[j] = student1s[j + 1];
                }
                student1s[studentCount - 1] = null;
                studentCount--;
                return true;
            }
        }
        return false;
    }

    public Student1 findStudentWithHighestGrades() {
        if (studentCount == 0) {
            return null;
        }

        Student1 topStudent = student1s[0];
        double highestAverage = topStudent.getAverageGrade();

        for (int i = 1; i < studentCount; i++) {
            double currentAverage = student1s[i].getAverageGrade();
            if (currentAverage > highestAverage) {
                highestAverage = currentAverage;
                topStudent = student1s[i];
            }
        }

        return topStudent;
    }
}
