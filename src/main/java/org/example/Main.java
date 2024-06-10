package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Der NoArgs und AllArgs Konstruktor:
        Student student1 = new Student();
        Student student2 = new Student("123","Volker","Büchsenweg",2.4);
        Map<String,Student> allStudents= new HashMap<>();
        allStudents.put("123",student1);
        allStudents.put("456",student2);

        Teacher teacher1 = new Teacher("2","Müller","English");

        Course course1 = new Course("4", "English",teacher1, allStudents );

        //Ausprobieren von Settern und Gettern und toString
        System.out.println(student1);
        student1.setId("343");
        student1.setName("Georg");
        student1.setAdress("Fahrenwinkel");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.getAdress()+"\n");

        //Testen der Equals Methode
        System.out.println("Sind Student1 und Student2 identisch? " + student1.equals(student2)+"\n");

        //toString von Course
        System.out.println(course1);

        //Create Student, Teacher and Course with Builder pattern
        Student student3 = Student.builder()
                .id("454")
                .build();
        Teacher teacher2 = Teacher.builder()
                .id("2")
                .build();
        Course course2 = Course.builder()
                .id("2")
                .name("German")
                .build();
        //course2.setTeacher(teacher2);
        allStudents.put("454",student3);
        System.out.println(allStudents);
        System.out.println(course2);

        //Using With to "update" the Record with changed value
        teacher2 = teacher2.withName("Hannemann");
        System.out.println(teacher2);



    }
}