package Lab4;

import java.util.ArrayList;

public class Room {
    public String tenPhong;
    public String viTri;
    public ArrayList<User> Ds;
    public Room(){
        Ds=new ArrayList<>();
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void them(User u){
        this.Ds.add(u);
    }
    public void xoa(User u){
        this.Ds.remove(u);
    }
    public void print(){

       for(User u : this.Ds){
           u.inThongtin();
       }

        }

}


