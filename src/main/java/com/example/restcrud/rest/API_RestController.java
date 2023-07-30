package com.example.restcrud.rest;

import com.example.restcrud.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class API_RestController {

    Student[] students;

    @PostConstruct
    void loadStudents(){
        students = new Student[]{
                new Student("Azhy", "Goran"),
                new Student("Ahmed", "Jamal"),
                new Student("Dana", "Jaza")
        };
    }

    @GetMapping("/teacher")
    public Object getTeacher(Integer id){
        if(id != null && students.length > id) return students[id];
        return "non";
    }

    @GetMapping("/student")
    public List<Student> getStudents(){
        return Arrays.stream(students).toList();
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable Integer studentId){

        if(studentId >= students.length || studentId < 0)
            //this is my custom preferred code
            throw new StudentException("Student id not found - " + studentId, HttpStatus.NOT_FOUND);
            //this is the actual code
            //throw new StudentNotFoundException("Student id not found - " + studentId);

        return students[studentId];
    }

}
