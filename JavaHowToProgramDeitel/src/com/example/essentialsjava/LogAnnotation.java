package com.example.essentialsjava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class LogAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface LogExecution {
    }

    static class PaymentService {

        @LogExecution
        public void processPayment() {
            System.out.println("Processing payment...");
        }

        public void checkBalance() {
            System.out.println("Checking balance...");
        }
    }
}
