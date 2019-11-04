package Jv2_Assignment1;

public class Sp {
    public String name;
    public String ID;
    public int price;
    public int salary;

    public Sp(String name, String ID, int price, int salary) {
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
