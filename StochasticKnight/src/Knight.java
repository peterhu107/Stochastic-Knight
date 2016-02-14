import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter Hu on 2016-02-13.
 */
public class Knight {
    private Location location;
    private static Move[] allMoves;
    public Knight(Location l) {
        location = l;
        allMoves = Move.values();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(int x, int y) {
        location.setX(x);
        location.setY(y);
    }

    public List<Move> getValidMoves() {
        List<Move> moves = new ArrayList<Move>();
        for (int i = 0; i < Move.values().length; i++) {
            if (isValidMove(allMoves[i])) {
                moves.add(allMoves[i]);
            }
        }

        return moves;
    }

    public void applyMove(Move m) {
        int dx = m.getDX();
        int dy = m.getDY();
        int new_x = location.getX() + dx;
        int new_y = location.getY() + dy;
        location.setX(new_x);
        location.setY(new_y);
    }

    public Move[] getMoves() {
        return allMoves;
    }

    public boolean isValidMove(Move m) {
        int x = location.getX();
        int y = location.getY();
        int dx = m.getDX();
        int dy = m.getDY();
        return (0 <= x+dx) && (7 >= x+dx) && (0 <= y+dy) && (7 >= y+dy);
    }
}
