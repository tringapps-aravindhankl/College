package school;
import java.util.Scanner;

class Student {
    String name;
    char grade;
    float gpa;

    Student(String a, char b, float c) {
        name = a;
        grade = b;
        gpa = c;
    }

    void update(float a) {
        gpa = a;
        System.out.println(name + " has a " + gpa + " GPA");
    }
}
public class Helo
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);

        System.out.println("enter your name");
        String name = scan.nextLine();

        System.out.println("enter your Grade");
        char grad = scan.next().charAt(0);

        System.out.println("enter your GPA");
        float gpa = scan.nextFloat();

        Student a = new Student(name, grad, gpa);

        System.out.println("Do you update GPA? 1.yes  2.no");
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("enter GPA");
            float mark = scan.nextFloat();
            a.update(mark);
        } else {
            System.out.println("thank you");
        }

    }
}
