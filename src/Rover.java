class Rover {



private Coordinates coordinates;
private CardinalPoint cardinalPoint;


public Rover(Coordinates coordinates, CardinalPoint cardinalPoint) {
        this.coordinates = coordinates;
        this.cardinalPoint = cardinalPoint;
        }



public void turnRight() {
        switch(this.cardinalPoint.getCardinalPoint()) {
        case 'E':
        this.cardinalPoint.setCardinalPoint('S');
        break;
        case 'N':
        this.cardinalPoint.setCardinalPoint('E');
        break;
        case 'S':
        this.cardinalPoint.setCardinalPoint('W');
        break;
        case 'W':
        this.cardinalPoint.setCardinalPoint('N');
        break;
default:
        throw new IllegalArgumentException("Cardinal point invalid");
        }

        }

public void turnLeft() {
        switch(this.cardinalPoint.getCardinalPoint()) {
        case 'E':
        this.cardinalPoint.setCardinalPoint('N');
        break;
        case 'N':
        this.cardinalPoint.setCardinalPoint('W');
        break;
        case 'S':
        this.cardinalPoint.setCardinalPoint('E');
        break;
        case 'W':
        this.cardinalPoint.setCardinalPoint('S');
        break;
default:
        throw new IllegalArgumentException("Cardinal point invalid");
        }

        }

public void moveForward() {
    switch(this.cardinalPoint.getCardinalPoint()) {
        case 'E':
           this.coordinates.controlCoordinates(0); //0.CASE incrementX

            break;
        case 'N':
            this.coordinates.controlCoordinates(1); // 1.CASE incrementY
            break;
        case 'S':
            this.coordinates.controlCoordinates(3); //3.CASE decrementX
            break;
        case 'W':
            this.coordinates.controlCoordinates(2); //2.CASE decrementY
            break;
        default:
            throw new IllegalArgumentException("Cardinal point invalid");
        }

        }




public Coordinates getCoordinates()
        {
        return coordinates;
        }


public char getCardinalPoint() {

        return this.cardinalPoint.getCardinalPoint();
        }

public String toString() {

        return this.coordinates.toString() + " " + this.cardinalPoint.getCardinalPoint();

}


        }