package com.example.Application.controllers;


import com.example.Application.resource.StudentRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.Application.resource.Student;

import java.util.List;

    @Controller
    public class StudentRetrieveController {
        @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
        @ResponseBody
        public List<Student> getAllStudents() {
            return StudentRegistration.getInstance().getStudentRecords();
        }
    }

