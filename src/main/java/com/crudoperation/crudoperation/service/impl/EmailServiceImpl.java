package com.crudoperation.crudoperation.service.impl;

import com.crudoperation.crudoperation.entity.EmailDetails;
import com.crudoperation.crudoperation.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailServiceImpl implements EmailService {


    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}") private String sender;
    @Override
    public String sendSimpleMail(EmailDetails emailDetails) {
        try {
            SimpleMailMessage simpleMailMessage=new SimpleMailMessage();

            //setting up necessary details
            simpleMailMessage.setFrom(sender);
            simpleMailMessage.setTo(emailDetails.getRecipient());
            simpleMailMessage.setText(emailDetails.getMsgBody());
            simpleMailMessage.setFrom(emailDetails.getSubject());
            //sending the mail
            javaMailSender.send(simpleMailMessage);
            return "mail sent Successfully";
        }
        catch (Exception e){
            return "Error while Sending mail";
        }
    }
}
