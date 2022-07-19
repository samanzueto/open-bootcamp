package com.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SaludarService saludo = (SaludarService) context.getBean("saludarService");

        saludo.sayHi();
        //SaludarService calculadora2 = (SaludarService) context.getBean("calculatorService");

        //System.out.println(calculadora2.holaMundo());

    }
}
