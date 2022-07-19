package com.example2;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        System.out.println("Ejecutando Clase UserService");
        this.notificationService = notificationService;
    }
}
