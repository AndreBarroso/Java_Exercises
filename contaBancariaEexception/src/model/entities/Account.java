package model.entities;

import com.sun.source.tree.ReturnTree;
import model.exceptions.DomaindExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) throws DomaindExceptions{
        Integer comp = 1;
        if (number.getClass().getSimpleName() != comp.getClass().getSimpleName()) {
            throw new DomaindExceptions("Enter error: " +
                    "Number must be interger");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getwithDrawLimit() {
        return withDrawLimit;
    }

    public void setwithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withDraw(Double amount) throws DomaindExceptions{
        if(amount > withDrawLimit) {
            throw new DomaindExceptions("WithdrawError: " +
                    "The amount exceeds withdrawn limit");
        }
        if (amount > balance) {
            throw new DomaindExceptions("WithdrawError: " +
                    "Not enough balance");
        }
    }
    public String getBalance() {
        return "New balance " + balance;
    }

}
