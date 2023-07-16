package com.crudoperation.crudoperation.controller;

import com.crudoperation.crudoperation.entity.EmailDetails;
import com.crudoperation.crudoperation.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails emailDetails){
        String status = emailService.sendSimpleMail(emailDetails);
        return status;
    }
}
