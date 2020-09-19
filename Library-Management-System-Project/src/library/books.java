package library;

import java.util.Date;
import javax.swing.JTable;

public class books implements data {

    public int id;
    public String bookname;
    public int bookno;
    public Date cr_date;
    public String creator;
    public String house;
    public String spc;
    public byte[] img;
    public String image_path;

    public books(int id, String bookname, int bookno, Date cr_date, String creator, String house, String spc, byte[] img, String image_path) {
        this.id = id;
        this.bookname = bookname;
        this.bookno = bookno;
        this.cr_date = cr_date;
        this.creator = creator;
        this.house = house;
        this.spc = spc;
        this.img = img;
        this.image_path = image_path;

    }

    public books(String bookname, int bookno, String creator) {
        this.bookname = bookname;
        this.bookno = bookno;
        this.creator = creator;
    }

    public books() throws Exception {

    }

    public int getId() {
        return id;
    }

    public String getBookname() {
        return bookname;
    }

    public int getBookno() {
        return bookno;
    }

    public Date getCr_date() {
        return cr_date;
    }

    public String getCreator() {
        return creator;
    }

    public String getHouse() {
        return house;
    }

    public String getSpc() {
        return spc;
    }

    public byte[] getImg() {
        return img;
    }

    public String getImage_path() {
        return image_path;
    }

    @Override
    public void searchinfo(String Statement, JTable Table) {
        db.go.Jtable(Statement, Table);
    }

    @Override
    public void showAll(JTable table) {
        db.go.Jtable("book", table);
    }

    //--------------------------
    public void StudentSearchBook(String stmt, JTable table) {
        db.go.StudentTableSearch(stmt, table);
    }


}
