import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinc sayı : ");
        int number1 = input.nextInt();

        System.out.print("İkinci sayı : ");
        int number2 = input.nextInt();

        int ebob = findEBOB(number1, number2);
        int ekok = findEKOK(number1, number2);

        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
    }

    // EBOB'u bulmak için
    public static int findEBOB(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2)
                number1 -= number2;
            else
                number2 -= number1;
        }
        return number1;
    }

    // EKOK'u bulmak için
    public static int findEKOK (int number1, int number2) {
        int multiplication = number1 * number2;
        int ebob = findEBOB(number1, number2);
        return multiplication / ebob;
    }
}