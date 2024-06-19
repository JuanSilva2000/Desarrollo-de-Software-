import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Map mapita = new Map();
        int num_cannonTower = 2;
        int num_laserTower = 1;
        int num_arrowTower = 2;
        Scanner scanner = new Scanner(System.in);

        mapita.addBase(3, 5);

        for (int i = 0; i < num_cannonTower; i++) {
            int posx = 0;
            int posy = 0;

            System.out.print("\nPLACE_TOWER Cannon-x: ");
            posx = scanner.nextInt();

            System.out.print("PLACE_TOWER Cannon-y: ");
            posy = scanner.nextInt();

            mapita.addCannonTower(posx,posy);
        }

        for (int i = 0; i < num_laserTower; i++) {
            int posx = 0;
            int posy = 0;

            System.out.print("\nPLACE_TOWER Laser-x: ");
            posx = scanner.nextInt();

            System.out.print("PLACE_TOWER Laser-y: ");
            posy = scanner.nextInt();

            mapita.addLaserTower(posx,posy);
        }

        for (int i = 0; i < num_arrowTower; i++) {
            int posx = 0;
            int posy = 0;

            System.out.print("\nPLACE_TOWER Arrow-x: ");
            posx = scanner.nextInt();

            System.out.print("PLACE_TOWER Arrow-y: ");
            posy = scanner.nextInt();

            mapita.addArrowTower(posx,posy);
        }


        mapita.printMap();



    }
}
