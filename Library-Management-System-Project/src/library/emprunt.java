package library;

import java.util.Date;
import javax.swing.JTable;

public class emprunt implements data {

    public int id;
    public String name;
    public String tasjil;
    public String Class;
    public String book;
    public String bookno;
    public Date date_of_Stiring;
    public Date date_of_return;
    public byte[] std_image;
    public String path;
    public String diff;

    public emprunt(int id, String name, String tasjil, String Class, String book, String bookno, Date date_of_stiring, Date date_of_return, byte[] std_image, String path, String diff) {
        this.id = id;
        this.name = name;
        this.tasjil = tasjil;
        this.Class = Class;
        this.book = book;
        this.bookno = bookno;
        this.date_of_Stiring = date_of_stiring;
        this.date_of_return = date_of_return;
        this.std_image = std_image;
        this.path = path;
        this.diff = diff;
    }

    public emprunt() throws Exception {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTasjil() {
        return tasjil;
    }

    public String getStd_Class() {
        return Class;
    }

    public String getBook() {
        return book;
    }

    public String getBookno() {
        return bookno;
    }

    public Date getDate_of_Stiring() {
        return date_of_Stiring;
    }

    public Date getDate_of_Return() {
        return date_of_return;
    }

    public byte[] getStd_image() {
        return std_image;
    }

    public String getPath() {
        return path;
    }

    public String getDiff() {
        return diff;
    }

    @Override
    public void searchinfo(String Statement, JTable Table) {
        db.go.EmpruntTableSearch(Statement, Table);
    }

    @Override
    public void showAll(JTable Table) {
        db.go.EmpruntTableSearch("add_emprunt", Table);
    }

}
