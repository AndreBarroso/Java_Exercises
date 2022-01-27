package application.service;

import java.util.Calendar;
import java.util.Date;

public class CalculateMonth {
    private Date date;

    public CalculateMonth(Date date) {
        this.date = date;
    }

    public Date calculate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 1);
        date = cal.getTime();
        return date;
    }
}
