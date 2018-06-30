
package test123;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
ArrayList l=new ArrayList();
Student s1=new Student(101,"Raju");
Student s2=new Student(104,"Bunty");
Student s3=new Student(105,"Bubly");
Student s4=new Student(106,"Shyam");
l.add(s1);
l.add(s2);
l.add(s3);
l.add(s4);
        System.out.println(l);
     Collections.sort(l);
        System.out.println(l);
    }
    
}