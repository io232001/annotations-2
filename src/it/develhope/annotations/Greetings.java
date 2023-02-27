package it.develhope.annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface DevAnnotation {
    String devName();
    String devSurname();
}
public class Greetings {
    @DevAnnotation(devName="Mario", devSurname="Rossi")
    public void sayWelcome() {
        System.out.println("Welcome!");
    }
    @DevAnnotation(devName="Giorgio", devSurname="Bianchi")
    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}
