package org.example.SistemaNotificacionesEmail;

public interface IMailServer {
    String sendEmail(String receiver,String subject,String messageContent);
}
