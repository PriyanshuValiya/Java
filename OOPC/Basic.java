package Java.OOPC;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount myacc = new BankAccount();
        myacc.userName = "priyanshuvaliya";
        myacc.setPassword("priyansu");
    }
}

class BankAccount {
    public String userName;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

/* ----------------------------------------------------------------------------- */

public class Basic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Priyanshu";
        s1.roll = 141;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s2.marks[2] = 75;
        for(int i=0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        this.marks = s1.marks;
    }

    Student() {
        System.out.println("Constructor is calling...");
        marks = new int[3];
    }

    Student(String name) {
        this.name = name;
        marks = new int[3];
    }

    Student(int roll) {
        this.roll = roll;
        marks = new int[3];
    }
}