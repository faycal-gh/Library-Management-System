package library;

import java.sql.Blob;
import java.util.Date;
import javax.swing.JTable;

public class std implements data {

    public String name;
    public int tasjil;
    public Date birth_date;
    public String Class;
    public String level;
    public String birth_place;
    public String email;
    public byte[] image;
    public String path;
    public String phone;
    int id;

    public std(int id, String Name, int tasjil, Date birth_date, String birth_place, String Class, String level, String phone, String email, byte[] image, String path) {
        this.id = id;
        this.name = Name;
        this.tasjil = tasjil;
        this.birth_date = birth_date;
        this.birth_place = birth_place;
        this.Class = Class;
        this.level = level;
        this.phone = phone;
        this.email = email;
        this.image = image;
        this.path = path;
    }

    public std(/*int tasjil,*/String name, String Class, byte[] image,String path) {
        //this.tasjil = tasjil;
        this.name = name;
        this.Class = Class;
        this.image = image;
        this.path = path;
    }

   

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTasjil() {
        return tasjil;
    }

    public Date getBirthDate() {
        return birth_date;
    }

    public String getbirth_place() {
        return birth_place;
    }

    public String getclass() {
        return Class;
    }

    public String getlevel() {
        return level;
    }

    public String getphone() {
        return phone;
    }

    public String getemail() {
        return email;
    }

    public byte[] getImage() {
        return image;
    }

    public String getPath() {
        return path;
    }

    public std() throws Exception {

    }

    @Override
    public void searchinfo(String Statement, JTable Table) {
        db.go.StdTableSearch(Statement, Table);
    }

    @Override
    public void showAll(JTable table) {
        db.go.StdTableSearch("add_std", table);
    }

}
