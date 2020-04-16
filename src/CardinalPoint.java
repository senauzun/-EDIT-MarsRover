public class CardinalPoint {
    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final char WEST = 'W';
    public static final char EAST = 'E';
    private char cardinalPoint;

    public CardinalPoint(char cardinalPoint) {
        if (cardinalPoint != 'N' && cardinalPoint != 'S' && cardinalPoint != 'W' && cardinalPoint != 'E') {
            throw new IllegalArgumentException("Cardinal point invalid");
        } else {
            this.cardinalPoint = cardinalPoint;
        }
    }

    public void setCardinalPoint(char cardinalPoint) {
        if (cardinalPoint != 'N' && cardinalPoint != 'S' && cardinalPoint != 'W' && cardinalPoint != 'E') {
            throw new IllegalArgumentException("Cardinal point invalid");
        } else {
            this.cardinalPoint = cardinalPoint;
        }
    }

    public char getCardinalPoint() {

        return this.cardinalPoint;
    }
}