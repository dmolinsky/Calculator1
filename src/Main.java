

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int variable1;
            int variable2;
            int result;

            System.out.println("Ange första variabel > ");
            Scanner input = new Scanner(System.in);
            variable1 = input.nextInt();
            System.out.println("Ange andra variabel > ");
            variable2 = input.nextInt();

            do {
                System.out.println("\nVälj uträkningen att utföra:");
                System.out.println("1. Addera. \n2. Subtrahera. \n0. Avsluta.");
                int val = input.nextInt();

                if( val == 1){
                    result = add(variable1, variable2);
                    System.exit(0);
                }
                else if ( val == 2){
                    result = subtract(variable1, variable2);
                    System.exit(0);
                }
                else if ( val == 0)
                    System.exit(0);
                else
                    System.out.println("Fel val, försök igen... ");
            }while(true);
        }

        public static int add(int variable1, int variable2) {
            int result = variable1 + variable2;
            System.out.println(variable1 + " + " + variable2 + " = " + result);
            return result;
        }

        public static int subtract(int variable1, int variable2) {
            int result = variable1 - variable2;
            System.out.println(variable1 + " - " + variable2 + " = " + result);
            return result;
        }
}
