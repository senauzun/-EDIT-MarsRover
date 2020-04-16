
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testOfRover{

    public Rover rover;

    @Before
    public void applyNumber() {
        Coordinates coordinates = new Coordinates();
        CardinalPoint cardinalPoint = new CardinalPoint(CardinalPoint.NORTH);
        rover = new Rover(coordinates, cardinalPoint);
    }


    @Test
    public void turnRight90Degrees() {
        rover.turnRight();
        char expected = CardinalPoint.EAST;
        assertEquals(expected, rover.getCardinalPoint());
    }

    @Test
    public void turnRight180Degrees() {
        rover.turnRight();
        rover.turnRight();
        char expected = CardinalPoint.SOUTH;
        assertEquals(expected, rover.getCardinalPoint());
    }


    @Test
    public void turnLeft90Degrees() {
        rover.turnLeft();
        char expected = CardinalPoint.WEST;
        assertEquals(expected, rover.getCardinalPoint());
    }

    @Test
    public void turnLeft180Degrees() {
        rover.turnLeft();
        rover.turnLeft();
        char expected = CardinalPoint.SOUTH;
        assertEquals(expected, rover.getCardinalPoint());
    }

    @Test
    public void turnLeft270Degrees() {
        rover.turnLeft();
        rover.turnLeft();
        rover.turnLeft();
        char expected = CardinalPoint.EAST;
        assertEquals(expected, rover.getCardinalPoint());
    }



    @Test
    public void turnLeft360Degrees() {
        rover.turnLeft();
        rover.turnLeft();
        rover.turnLeft();
        rover.turnLeft();
        char expected = CardinalPoint.NORTH;
        assertEquals(expected, rover.getCardinalPoint());
    }

    @Test
    public void moveNorth() {
        rover.moveForward();
        int y = 1;
        int x = 0;
        assertEquals(y, rover.getCoordinates().getY());
        assertEquals(x, rover.getCoordinates().getX());
    }

    @Test
    public void moveEast() {
        rover.turnRight();
        rover.moveForward();
        int y = 0;
        int x = 1;
        assertEquals(y, rover.getCoordinates().getY());
        assertEquals(x, rover.getCoordinates().getX());
    }



}
