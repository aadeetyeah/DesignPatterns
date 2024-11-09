package subject;

import observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;

    private String status;

    private List<Observer> observers = new ArrayList<>();
    //Any Collection can be used for Observers storage.

    public Order(int id){
        this.id = id;
        this.status = "Order placed!";
    }

    public int getId(){
        return id;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String newStatus){
        this.status = newStatus;
        notifyObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void dettach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(this);
        }
    }
}
