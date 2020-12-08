public class MyPoint {
    // member fields (encapsulated)
    private int x;
    private int y;

    // no-args constructor
    public MyPoint() {
        setX(0);
        setY(0);
    }

    // parameterized constructor
    public MyPoint(int xCoord, int yCoord) {
        setX(xCoord);
        setY(yCoord);
    }

    // static non-member class methods
    public static double distance(MyPoint mp1, MyPoint mp2) {
        double xDiffSquared = Math.pow(mp1.getX() - mp2.getX(), 2);
        double yDiffSquared = Math.pow(mp1.getY() - mp2.getY(), 2);
        return Math.sqrt( xDiffSquared + yDiffSquared);
    }

    // instance member methods
    public double distance(int xCoord, int yCoord) {
        double xDiffSquared = Math.pow(xCoord - getX(), 2);
        double yDiffSquared = Math.pow(yCoord - getY(), 2);
        return Math.sqrt( xDiffSquared + yDiffSquared);
    }

    public double distance(MyPoint p) {
        double xDiffSquared = Math.pow(p.getX() - getX(), 2);
        double yDiffSquared = Math.pow(p.getY() - getY(), 2);
        return Math.sqrt( xDiffSquared + yDiffSquared);
    }

    // getters and setters for instances of MyPoint
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString
    @Override
    public String toString() {
        return String.format("(%d,%d)", getX(),getY());
    }

}
