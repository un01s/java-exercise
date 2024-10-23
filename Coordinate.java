public class Coordinate {

    private int x; // x-coordinate
    private int y; // y-coordinate

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean equals(Coordinate c) {
        return this.x == c.getX() && this.y == c.getY();
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
