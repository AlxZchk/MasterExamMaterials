package main.java.my.app;

public class Point {
    private int x;
    private int y;
  
    Point(int x, int y) throws ValueOutOfBoundsException {
      setX(x);
      setY(y);
    }
  
    /**
     * @return the x
     */
    public int getX() {
      return x;
    }
  
    /**
     * @return the y
     */
    public int getY() {
      return y;
    }
  
    /**
     * @param x the x to set
     */
    public void setX(int x) throws ValueOutOfBoundsException {
      if (x >= 0 && x < 800) {
        this.x = x;
      } else {
        throw new ValueOutOfBoundsException("Value is out of bounds");
      }
      
    }
  
    /**
     * @param y the y to set
     */
    public void setY(int y) throws ValueOutOfBoundsException {
      if (y >= 0 && y < 600) {
        this.y = y;
      } else {
        throw new ValueOutOfBoundsException("Value is out of bounds");
      }
    }

    public String toString() {
        return "" + x + " " + y;
    }
  
    static Point addPoint(Point p1, Point p2) throws ValueOutOfBoundsException {
      int x = p1.getX() + p2.getX();
      int y = p1.getY() + p2.getY();
  
      if (x > 800) { x = x - 800; }
      if (y > 600) { y = y -600; }
  
      return new Point(x, y);
    }
  }