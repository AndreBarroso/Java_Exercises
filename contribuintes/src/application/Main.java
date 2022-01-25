package application;

import entities.Geral;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number of tax players: ");
        int taxes = sc.nextInt();

        List<Geral> incomes = new ArrayList<>();
        for(int i = 1; i <= taxes; i ++) {
            sc.nextLine();
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            String type = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();
            if(type.equals("i")) {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                incomes.add( new PessoaFisica(name, anualIncome,healthExpenditures));
                sc.nextLine();
            }
            else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployee = sc.nextInt();
                incomes.add( new PessoaJuridica(name, anualIncome, numberOfEmployee));
                sc.nextLine();
            }
        }

        System.out.println("");
        System.out.println("TAXES PAID:");

        Double totalTaxes = 0.00;
        for(Geral data: incomes) {
            totalTaxes += data.imposto();
            System.out.println(data.getNome() + " $ " + data.imposto());
        }

        System.out.println("");
        System.out.println("TOTAL TAXES: " + totalTaxes);

        sc.close();
    }
}
