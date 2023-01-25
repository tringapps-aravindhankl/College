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
        logger.log(name + " has a " + gpa + " GPA");
    }
}
public class Helo
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);

        logger.log("enter your name");
        String name = scan.nextLine();

        logger.log("enter your Grade");
        char grad = scan.next().charAt(0);

        logger.log("enter your GPA");
        float gpa = scan.nextFloat();

        Student a = new Student(name, grad, gpa);

        logger.log("Do you update GPA? 1.yes  2.no");
        int option = scan.nextInt();
        if (option == 1) {
            logger.log("enter GPA");
            float mark = scan.nextFloat();
            a.update(mark);
        } else {
            logger.logln("thank you");
        }

    }
}
