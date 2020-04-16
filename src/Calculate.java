import java.util.Scanner;



public class Calculate {

    public Calculate() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxX = 5;
        int maxY = 5;
        boolean[] diziDon= {true,true,true,true};

        while (true) {
            System.out.print("Enter x :");
            Integer coordX = scanner.nextInt();
            System.out.print("Enter y:");
            Integer coordY = scanner.nextInt();


            Scanner src = new Scanner(System.in);
            System.out.print("Enter Direction ( N,S,W,E):");
            String dir = src.nextLine();

            System.out.print("Enter Command ( L,R,M): ");
            String commands1 = src.nextLine();


            //x , y koordinatlı ve boolean dizi Coordinates.diziDon
            Coordinates coordinates = new Coordinates(coordX, coordY,diziDon);
            char cardinalPointChar = dir.charAt(0);

            // take many commands for calculate different position and directions
            //3,3,'E' ---> RMMLMM --> 5,1,'E'
            char[] command = commands1.toCharArray();

            CardinalPoint cardinalPoint = new CardinalPoint(cardinalPointChar);
            Rover rover = new Rover(coordinates, cardinalPoint);



            Directions.execute(rover, command);
            diziDon = coordinates.diziDondur();


        }
    }

}
