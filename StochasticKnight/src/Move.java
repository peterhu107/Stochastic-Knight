/**
 * Created by Peter Hu on 2016-02-13.
 */
public enum Move {
    // The eight possible moves for a Knight R = right, U = up, ...
    RUU, RRU, RRD, RDD, LDD, LLD, LLU, LUU;

    public int getDX() {
        switch(this) {
            case RUU:
            case RDD:
                return 1;
            case RRU:
            case RRD:
                return 2;
            case LDD:
            case LUU:
                return -1;
            case LLU:
            case LLD:
                return -2;
            default: return 0;
        }
    }

    public int getDY() {
        switch(this) {
            case RRU:
            case LLU:
                return 1;
            case RUU:
            case LUU:
                return 2;
            case LLD:
            case RRD:
                return -1;
            case LDD:
            case RDD:
                return -2;
            default: return 0;
        }
    }
}
