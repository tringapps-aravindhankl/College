package school;

import java.util.logging.Level;
import java.util.logging.Logger;

class Student {
    String name;
    char grade;
    float gpa;
    Logger log=Logger.getLogger("hi");
    Student(String name, char grade, float gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    void update(float mark) {
        gpa = mark;
        log.log(Level.INFO,()->name+gpa+"has a GPA");
    }
}
