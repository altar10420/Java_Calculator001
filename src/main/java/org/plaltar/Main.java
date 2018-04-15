package org.plaltar;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Main {
    private static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {

        Validator validator = new Validator();
        Calculator calculator = new Calculator();

        System.out.println("Witaj, wybierz operację...");

        do {
            do {
                System.out.println("1 - dodawanie");
                System.out.println("2 - odejmowanie");
                System.out.println("3 - mnożenie");
                System.out.println("4 - dzielenie");
                System.out.println("q - wyjście z programu\n");

                String userOperation = SC.nextLine();

                if (userOperation.equals("1")) {
                    calculator.use(new PlusOperation());
                    break;

                } else if (userOperation.equals("2")) {
                    calculator.use(new MinusOperation());
                    break;

                } else if (userOperation.equals("3")) {
                    calculator.use(new MultiplyOperation());
                    break;

                } else if (userOperation.equals("4")) {
                    calculator.use(new DivideOperation());
                    break;

                } else if (userOperation.equals("q")) {
                    validator.inputCheck = 1;
                    validator.exitCheck = 1;

                } else {
                    System.out.println("Spróbuj wybrać opcję jeszcze raz.\n");
                }

            } while (validator.inputCheck == 0);

            if (validator.exitCheck == 0) {

                do {

                    System.out.println("Podaj pierwszą liczbę: ");
                    String firstArgument = SC.nextLine(); // pod firstArgument jest adres w pamięci do SC
                    if (!firstArgument.matches("[0-9]+")) {
                        System.out.println("Błąd! " + firstArgument + " nie jest liczbą.");
                        System.out.println("Spróbuj jeszcze raz.\n");
                        break;
                    }
                    System.out.println("Podaj drugą liczbę: ");
                    String secondArgument = SC.nextLine();
                    if (!secondArgument.matches("[0-9]+")) {
                        System.out.println("Błąd! " + secondArgument + " nie jest liczbą.");
                        System.out.println("Spróbuj jeszcze raz.\n");
                        break;
                    }

                    double result = calculator.calculate(firstArgument, secondArgument);

                    if (result == Infinity) {
                        System.out.println("Pamiętaj cholero, nie dziel przez zero!");
                        System.out.println("Spróbuj jeszcze raz.\n");
                        break;
                    }
                    System.out.println("Twój wynik to: " + result + "\n");
                    System.out.println("Wybierz kolejną operację:");

                } while (validator.inputCheck == 1);


            } else {
                System.out.println("Zakończono...");
            }

        } while (validator.inputCheck == 0);
    }
}
