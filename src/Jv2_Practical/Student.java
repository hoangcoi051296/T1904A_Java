package Jv2_Practical;

public class Student {
    public int studenID;
    public String studentName;
    public String address;
    public String phone;

    public Student() {
    }

    public Student(int studenID, String studentName, String address, String phone) {
        this.studenID = studenID;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
    }

    public int getStudenID() {
        return studenID;
    }

    public void setStudenID(int studenID) {
        this.studenID = studenID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}