package Lab_session6;

public class Contact {
    public Integer id;
    public String name;
    public String company;
    public String address;

    public Contact() {
    }

    public Contact(Integer id, String name, String company, String address) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return this.getName();
    }
}
