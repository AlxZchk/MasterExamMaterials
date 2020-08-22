package main.java.my.app;

class Main {
    public static void main(String[] args) {
      try {
        Object point = new ColoredPoint(0, 123, 1, 1, 1);
        System.out.println(point);
      }  catch (ValueOutOfBoundsException err) {
        throw new RuntimeException("Bad point creation");
      }
      
    }
  }