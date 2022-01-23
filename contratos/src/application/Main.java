package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
	    System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("How many contracts to this worker? ");
        int numberOfContracts = sc.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        List<HourContract> contracts = new ArrayList<>();

        for (int i = 0; i < numberOfContracts; i += 1) {
            HourContract hourContract = new HourContract();
            sc.nextLine();
            int contract =  i + 1;
            System.out.println("Enter contract #" + contract + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            hourContract.setDate(sdf.parse(sc.nextLine()));
            System.out.print("Value per hour: ");
            hourContract.setValuePerHour(sc.nextDouble());
            sc.nextLine();
            System.out.print("Duration (hours): ");
            hourContract.setHours(sc.nextInt());
            contracts.add(hourContract);
        }
        sc.nextLine();
        Worker worker = new Worker(workerName, workerLevel, baseSalary, contracts, department);
        System.out.println("");
        System.out.println("");

        System.out.print("Enter month and year to calculate income (MM/yyyy): ");
        String searchData = sc.nextLine();
        int month = Integer.parseInt(searchData.substring(0, 2));
        int year = Integer.parseInt(searchData.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());

        Double finalSalary = baseSalary + worker.income(month, year);
        System.out.println("Income for " + searchData + " " + worker.income(month, year));
    }
}
