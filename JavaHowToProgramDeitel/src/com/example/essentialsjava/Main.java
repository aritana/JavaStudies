package com.example.essentialsjava;

public class Main {
    public static void main(String[] args) throws Exception {

        LogAnnotation.PaymentService service = new LogAnnotation.PaymentService();

        AnnotationRunner.run(service);
    }
}
