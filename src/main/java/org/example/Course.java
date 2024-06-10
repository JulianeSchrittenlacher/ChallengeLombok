package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private Map<String, Student> students;
}
