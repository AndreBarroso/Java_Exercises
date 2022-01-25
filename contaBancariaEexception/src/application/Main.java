package application;

import model.entities.Account;
import model.exceptions.DomaindExceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial Balance: ");
            Double initialBalance = sc.nextDouble();
            sc.nextLine();

            System.out.print("WithdrawLimit: ");
            Double withdrawLimit = sc.nextDouble();
            sc.nextLine();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter amount for Withdraw: ");
            Double amount = sc.nextDouble();
            sc.nextLine();

            account.withDraw(amount);



        }
        catch (DomaindExceptions e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("O numero deve ser um inteiro");
        }
        sc.close();
    }
}
