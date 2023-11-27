package Exercices.ss15_exception;

public class ClassException extends Exception{
    public ClassException(String message) {
//        super(message);
        System.out.println(message);
    }
}
