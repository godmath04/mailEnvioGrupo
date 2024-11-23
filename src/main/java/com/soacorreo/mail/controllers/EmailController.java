package com.soacorreo.mail.controllers;

import com.soacorreo.mail.services.IEmailService;
import com.soacorreo.mail.services.models.EmailDTO;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EmailController {
    @Autowired
    IEmailService emailService;
    @PostMapping("/send-email")
    private ResponseEntity<String> sendEmail(@RequestBody EmailDTO email) throws MessagingException {
        emailService.sendMail(email);
        return new ResponseEntity<>("Correo enviado exitosamente", HttpStatus.OK);
    }

    // Nuevo endpoint para manejar solicitudes GET
    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Bienvenido al servicio de correo!", HttpStatus.OK);
    }
}
