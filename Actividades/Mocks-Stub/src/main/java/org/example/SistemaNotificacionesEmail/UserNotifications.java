package org.example.SistemaNotificacionesEmail;

public class UserNotifications {
    IMailServer mailServer;

    public UserNotifications(IMailServer mailServer){
        this.mailServer = mailServer;
    }

    public String sendNotification(String receiver,String message){
        String subject = "Asunto: Notificacion";
        return mailServer.sendEmail(receiver,subject, message);
    }
}
