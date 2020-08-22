package main.java.my.app;

public class ValueOutOfBoundsException extends Exception {
    ValueOutOfBoundsException() {}
  
    ValueOutOfBoundsException(String message) {
      super(message);
    }
  }