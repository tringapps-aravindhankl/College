package school;
import java.util.Scanner;
import java.util.logging.*;

public class Helo
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
        Logger log=Logger.getLogger("hi");
        try {
        log.info("enter your name");
        String name = scan.nextLine();

        log.info("enter your Grade");
        char grad = scan.next().charAt(0);

        log.info("enter your GPA");
        float gpa = scan.nextFloat();
        log.log(Level.INFO,()->name+"GPA:) is"+gpa);
        Student object = new Student(name, grad, gpa);

        log.info("Do you update GPA? 1.yes  2.no");
        int option = scan.nextInt();
        if (option == 1) 
        {
            log.info("enter GPA");
            float mark = scan.nextFloat();
            object.update(mark);
        } 
        else 
        {
              log.info("Thank you");
        }
        }
        catch(Exception e)
        {
        	log.info(String.valueOf(e));
        	System.exit(0);    
        }

    }
}
