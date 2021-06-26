package classes_and_objects;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


       Student s1 = new Student("PALASH",33);
       s1.print();

       Student s2 = new Student("palak",56);
       s2.print();

        Student s3 = new Student("ok",56);
        s3.print();

       System.out.println(Student.getNumStudets());

    }
}
