package com.crudoperation.crudoperation.service;

import com.crudoperation.crudoperation.entity.EmailDetails;
import org.springframework.stereotype.Service;

@Service
public interface EmailService {

    //method to send a simple email
    String sendSimpleMail(EmailDetails emailDetails);


}
