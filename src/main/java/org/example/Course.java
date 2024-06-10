package org.example;

import lombok.*;

import java.util.Map;

@Value
@AllArgsConstructor
@Builder


public class Course {
    String id;
    String name;
    Teacher teacher;
    Map<String, Student> students;
}
