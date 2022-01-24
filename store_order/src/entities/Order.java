package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, Client client) {
        this.moment = moment;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItem() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total(){
        Double sum = 0.0;
        for(OrderItem item: items) {
            sum += item.subTotal();
        }
        return sum;
    }
}
