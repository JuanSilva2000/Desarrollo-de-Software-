package org.example.SistemaNotificacionesEmail;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserNotificationsTest {

    @Test
    public void envioNotifiacionesTest(){
        //Arrange
        IMailServer mailServerMock = mock(IMailServer.class);
        UserNotifications userNotifications = new UserNotifications(mailServerMock);
        String receiverTest = "destino@uni.pe";
        String messageContentTest = "Hello, esto es una notificacion";

        when(mailServerMock.sendEmail("destino@uni.pe","Asunto: Notificacion","Hello, esto es una notificacion"))
                .thenAnswer(e -> {
                    String receiver = e.getArgument(0);
                    String subject = e.getArgument(1);
                    String messageContent = e.getArgument(2);
                    return "Se ha enviado a " + receiver + " con asunto " + subject + ": " + messageContent;
                });

        //Act
        String result = userNotifications.sendNotification(receiverTest,messageContentTest);

        //Assert
        String stringEsperado = "Se ha enviado a destino@uni.pe con asunto Asunto: Notificacion: Hello, esto es una notificacion";
        assertThat(result).isEqualTo(stringEsperado);

        //Se verifica que el metodo sendEmail fue llamado una vez
        verify(mailServerMock, times(1)).sendEmail("destino@uni.pe",
                "Asunto: Notificacion",
                "Hello, esto es una notificacion");
    }




}
