import java.util.List;

/**
 * Created by Peter Hu on 2016-02-13.
 */
public class StochasticKnight {
    /**
     * A simulation for random Knight movement on a standard 8x8 chessboard.
     * The Knight starts at a specified location, and takes random moves among its allowed moves.
     * The simulator returns the average amount of moves required for the knight to reach its starting location.
     */
    private static Knight k = new Knight(new Location(0,0));

    public static boolean completed(int x, int y) {
        Location l = StochasticKnight.k.getLocation();
        return (l.getX() == x && l.getY() == y);
    }

    public static void main (String ... args) {
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                StochasticKnight.k.setLocation(a,b);  // Set start location

                int simulations = 10000;  // Number of simulations
                float totalSteps = 0;
                int currentSteps = 0;

                for (int i = 0; i < simulations; i++) {
                    do {
                        List<Move> moves = StochasticKnight.k.getValidMoves();
                        int choice = (int) Math.floor(Math.random() * (moves.size()));
                        Move move = moves.get(choice);
                        StochasticKnight.k.applyMove(move);
                        currentSteps++;

                    } while (!completed(a,b)); {
                        List<Move> moves = StochasticKnight.k.getValidMoves();
                        int choice = (int) Math.floor(Math.random() * (moves.size()));
                        Move move = moves.get(choice);
                        StochasticKnight.k.applyMove(move);
                        currentSteps++;
                    }
                    totalSteps += currentSteps;
                    currentSteps = 0;
                }
                System.out.println("Starting at Location " + a + "," + b + ": " + totalSteps/simulations);
            }
        }

    }
}
