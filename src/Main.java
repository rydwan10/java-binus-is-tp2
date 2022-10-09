import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalNumLength = 0, difference = 0;
        boolean isProgramRunning = true;
        Scanner scanner = new Scanner(System.in);

        while(isProgramRunning) {
            System.out.println("Belajar Deret Aritmatika, Geometri dan menghitung Faktorial");
            System.out.println(">---------------------------------------------------------<");

            // Input how much number user want
            boolean isInputTotalNumLengthValid = false;
            while(!isInputTotalNumLengthValid) {
                try{
                    System.out.print("Masukkan banyak angka yang mau dicetak [2..10] : ");
                    totalNumLength = Integer.parseInt(scanner.nextLine());
                    if(totalNumLength < 2 || totalNumLength > 10) {
                        System.out.println("Angka tidak boleh kurang dari 2 atau lebih dari 10!");
                    } else {
                        isInputTotalNumLengthValid = true;
                    }
                } catch(Exception e) {
                    System.out.println("Input harus angka!");
                }
            }

            // Input the difference
            boolean isInputDifferenceValid = false;
            while(!isInputDifferenceValid) {
                try{
                    System.out.print("Masukkan beda masing-masing angka [2..9] : ");
                    difference = Integer.parseInt(scanner.nextLine());
                    if(difference < 2 || difference > 9) {
                        System.out.println("Angka tidak boleh kurang dari 2 atau lebih dari 9!");
                    } else {
                        isInputDifferenceValid = true;
                    }
                } catch(Exception e) {
                    System.out.println("Input harus angka!");
                }
            }

            System.out.println("\n");
            CalculateFunction calculateFunction = new CalculateFunction(totalNumLength, difference);

            System.out.println("Deret Aritmatika : ");
            System.out.println(calculateFunction.printArithmetic());

            System.out.println("Deret Geometri : ");
            System.out.println(calculateFunction.printGeometry());

            System.out.println("Faktorial dari " + totalNumLength);
            System.out.println(calculateFunction.printFactorial());

            boolean isExitConfirmationValid = false;
            while(!isExitConfirmationValid) {
                System.out.println("Anda mau ulang [y/t]");
                String exitConfirmation = scanner.nextLine();
                if(exitConfirmation.toLowerCase(Locale.ROOT).equals("t")) {
                    isExitConfirmationValid = true;
                    isProgramRunning = false;
                } else if(exitConfirmation.toLowerCase(Locale.ROOT).equals("y")) {
                    isExitConfirmationValid = true;
                } else {
                    System.out.println("Input tidak valid!");
                }
            }
        }

    }
}