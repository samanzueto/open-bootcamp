package com.example2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("Ejecutando Clase NotificationService...");
    }

    public void sayHi(){
        System.out.println("Hola desde NotificationService!");
    }
}
