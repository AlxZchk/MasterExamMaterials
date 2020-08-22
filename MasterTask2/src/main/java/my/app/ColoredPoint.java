package main.java.my.app;

public class ColoredPoint extends Point {
    int r;
    int g;
    int b;
  
    ColoredPoint(int x, int y, int r, int g, int b) throws ValueOutOfBoundsException {
      super(x, y);
      setR(r);
      setG(g);
      setB(b);
      
    }
  
    public int getR() {
      return r;
    }
  
    public int getG() {
      return g;
    }
  
    public int getB() {
      return b;
    }
  
    public void setR(int r) throws ValueOutOfBoundsException {
      if (r >= 0 && r < 256) {
        this.r = r;
      } else {
        throw new ValueOutOfBoundsException("Value out of bounds!");
      }
    }
  
  
    public void setG(int g) throws ValueOutOfBoundsException {
      if (g >= 0 && g < 256) {
        this.g = g;
      } else {
        throw new ValueOutOfBoundsException("Value out of bounds!");
      }
    }
  
    public void setB(int b) throws ValueOutOfBoundsException {
      if (b >= 0 && b < 256) {
        this.b = b;
      } else {
        throw new ValueOutOfBoundsException("Value out of bounds!");
      }
    }

    public String toString() {
        return "" + getX() + " " + getY() + " " + getR() + " " + getG() + " " + getB();
    }
  
    static public ColoredPoint addColoredPoint(ColoredPoint p1, ColoredPoint p2) throws ValueOutOfBoundsException {
        Point point = Point.addPoint(p1, p2);
        int r = (p1.getR() + p2.getR()) / 2;
        int g = (p1.getG() + p2.getG()) / 2;
        int b = (p1.getB() + p2.getB()) / 2;
        return new ColoredPoint(point.getX(), point.getY(), r, g, b);
    }
  }