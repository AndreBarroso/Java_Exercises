package application.entities;

import java.util.Calendar;
import java.util.Date;

public class InstalmentByPaypal {
    private Date dueDate;
    private Double amount;

    public InstalmentByPaypal(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double instalmentOfMonth() {
        Calendar cal = Calendar.getInstance();
        cal.
    }
}
