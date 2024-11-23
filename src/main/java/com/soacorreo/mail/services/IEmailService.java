package com.soacorreo.mail.services;

import com.soacorreo.mail.services.models.EmailDTO;
import jakarta.mail.MessagingException;

public interface IEmailService {
    public void sendMail(EmailDTO email) throws MessagingException;

}
