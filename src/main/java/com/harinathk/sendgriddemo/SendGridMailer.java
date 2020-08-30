package com.harinathk.sendgriddemo;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGridAPI;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SendGridMailer {

    @Autowired
    private SendGridAPI sendGridAPI;

    void sendMail() {
        Email from = new Email("harinathk7@gmail.com", "Harinath K");
        String subject = "Test email with SendGrid";
        Email to = new Email("harinathk@gmail.com");
        Content content = new Content("text/plain", "Test email with Spring Boot");
        Mail mail = new Mail(from, subject, to, content);
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sendGridAPI.api(request);
            System.out.println(response.getBody());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}