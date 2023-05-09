import java.util.concurrent.Semaphore;

public class Main {
    public static int boatMutex = 1;
    public static int hacker = 0;
    public static int severant = 0;
    public static int quantity = 0;

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");



    while (quantity!=4) {

        boatHacker();
        boatSeverant();
    }
        RowBoat();
    }


    public static void boatSeverant() {
        while (true) {
            if (boatMutex != 0) {
                boatMutex--;
            }
            if (hacker != 3) {
                severant++;
                quantity++;

            } else {
                hacker++;
                quantity++;

            }

            boatMutex++;
            if(quantity==4) break;
        }

        }


        public static void boatHacker () {
        while (true) {
            if (boatMutex != 0) {
                boatMutex--;
            }
            if (severant != 3 ) {
                hacker++;
                quantity++;

            } else {
                severant++;
                quantity++;

            }

            boatMutex++;
            if(quantity==4) break;
            }
        }


        public static void RowBoat() {
            if (quantity == 4) {
                System.out.println("O barco está saindo! \n QtdServos e QtdHackers " + severant + hacker);
            }
        }
    }
