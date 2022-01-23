package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private String level;
    private Double baseSalary;

    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    public Worker(String name, String level, Double baseSalary, List<HourContract> contracts, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.contracts = contracts;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract( HourContract contract) {
        contracts.add(contract);
    }

    public void remove( HourContract contract) {
        contracts.remove(contract);
    }

    public Double income ( Integer year, Integer month) {
        Calendar cal = Calendar.getInstance();
        for( HourContract contract: contracts) {
            cal.setTime(contract.getDate());
            if(cal.get(Calendar.MONTH) == month) {
                return contract.totalValue();
            }
            return 33333.0;
        }
        return null;
    }



}
