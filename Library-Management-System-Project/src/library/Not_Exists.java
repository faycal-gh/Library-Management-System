package library;

import java.util.Date;
import javax.swing.JTable;

public class Not_Exists implements data {
    
    public int id;
    public String bookname;
    public int bookno;
    public Date cr_date;
    public String creator;
    public String house;
    public String spc;
    public byte[] img;
    public String image_path;
    
    public Not_Exists(int id, String bookname, int bookno, String creator, Date cr_date, String house, String spc, byte[] img, String image_path) {
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
    
    public Not_Exists() {
        
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
        db.go.SearchBookNotExist(Statement, Table);
    }
    
    @Override
    public void showAll(JTable Table) {
        
    }
    
}
