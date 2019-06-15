package com.example.Application.controllers;

import com.example.Application.resource.Student;
import com.example.Application.resource.StudentRegistration;
import com.example.Application.resource.StudentRegistrationReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class StudentRegistrationController {

    @RequestMapping(method = RequestMethod.POST, value="/register/student")
    @ResponseBody
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        System.out.println("In registerStudent");
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);
        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(student.getName());
        stdregreply.setAge(student.getId());
        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");
        return stdregreply;
    }

}
