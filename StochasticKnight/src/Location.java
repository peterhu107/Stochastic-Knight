/**
 * Created by Peter Hu on 2016-02-13.
 */
public class Location {
        /**
         * A location on a chess board. (0,0) is defined as the bottom left corner of the board, with
         * increasing x to the right and increasing y upwards.
         */
    private int x;
    private int y;
    public static final int X_MIN = 0;
    public static final int X_MAX = 7;
    public static final int Y_MIN = 0;
    public static final int Y_MAX = 7;
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

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
}
