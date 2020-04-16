public class Directions {
    public Directions() {

    }



    public static void execute(Rover rover, char[] commands) {

        char[] comm = commands;
        int commLen= commands.length;

        for (int i = 0; i < commLen; i++) {
            char command = comm[i];
            switch (command) {
                case 'L':
                    rover.turnLeft();
                    break;
                case 'M':
                    rover.moveForward();
                    break;
                case 'R':
                    rover.turnRight();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Direction");
            }
            System.out.println(rover.toString());
        }
    }

}
