package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class go {

    private static String url = "";
    private static Connection con;

    private static void SetURL() {
        url = "jdbc:mysql://localhost:3306/library"
                + "?useUnicode=true&characterEncoding=UTF-8";
    }

    private static void SetConnection() {
        try {
            SetURL();
            con = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static boolean CheckUserAndPass(String UserName, String Password) {
        try {
            SetConnection();
            Statement stm = con.createStatement();
            String StrCheck = "select * from name_and_password where username='" + UserName + "' and mypassword='"
                    + Password + "'";
            stm.executeQuery(StrCheck);
            if (stm.getResultSet().next()) {
                con.close();
                return true;
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }
    public static void Jtable(String statement, JTable table) {
        try {
            SetConnection();
            Statement st = con.createStatement();
            ResultSet rs;
            String strSelect;
            strSelect = "select * from " + statement;
            rs = st.executeQuery(strSelect);
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {
                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
//                    row.add(rs.getString(i));
                    switch (i) {
                        case 1:
                            row.add(rs.getString(7));
                            break;
                        case 2:
                            row.add(rs.getString(6));
                            break;
                        case 3:
                            row.add(rs.getString(5));
                            break;
                        case 4:
                            row.add(rs.getDate(4));
                            break;
                        case 5:
                            row.add(rs.getString(3));
                            break;
                        case 6:
                            row.add(rs.getString(2));
                            break;
                        case 7:
                            row.add(rs.getString(1));
                            break;
                    }
                }
                model.addRow(row);
            }

            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public static void StudentTableSearch(String statement, JTable table) {
        try {
            SetConnection();
            Statement st = con.createStatement();
            ResultSet rs;
            String strSelect;
            strSelect = "select * from " + statement;
            rs = st.executeQuery(strSelect);
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {
                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    switch (i) {
                        case 1:
                            row.add(rs.getString(7));
                            break;
                        case 2:
                            row.add(rs.getString(6));
                            break;
                        case 3:
                            row.add(rs.getString(5));
                            break;
                        case 4:
                            row.add(rs.getDate(4));
                            break;
                        case 5:
                            row.add(rs.getString(3));
                            break;
                        case 6:
                            row.add(rs.getString(2));
                            break;
                        case 7:
                            row.add(rs.getString(1));
                            break;

                    }
                }
                model.addRow(row);
            }

            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public static void SearchBookNotExist(String statement, JTable table) {
        try {
            SetConnection();
            Statement st = con.createStatement();
            ResultSet rs;
            String strSelect;
            strSelect = "SELECT `book_id` ,`bookname`, `bookno`, `cr_date`, `creator`, `house`, `book_spc` FROM `book`,`add_emprunt` WHERE bookno = add_emprunt.book_no and " + statement;
            rs = st.executeQuery(strSelect);
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {
                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    switch (i) {
                        case 1:
                            row.add(rs.getString("book_spc"));
                            break;
                        case 2:
                            row.add(rs.getString("house"));
                            break;
                        case 3:
                            row.add(rs.getDate("cr_date"));
                            break;
                        case 4:
                            row.add(rs.getString("creator"));
                            break;
                        case 5:
                            row.add(rs.getString("bookno"));
                            break;
                        case 6:
                            row.add(rs.getString("bookname"));
                            break;
                        case 7:
                            row.add(rs.getString("book_id"));
                            break;
                    }
                }
                model.addRow(row);
            }

            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public static void StdTableSearch(String statement, JTable table) {
        try {
            SetConnection();
            Statement st = con.createStatement();
            ResultSet rs;
            String strSelect;
            strSelect = "select * from " + statement;
            rs = st.executeQuery(strSelect);
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {
                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    switch (i) {
                        case 1:
                            row.add(rs.getString(9));
                            break;
                        case 2:
                            row.add(rs.getString(8));
                            break;
                        case 3:
                            row.add(rs.getString(7));
                            break;
                        case 4:
                            row.add(rs.getString(6));
                            break;
                        case 5:
                            row.add(rs.getString(5));
                            break;
                        case 6:
                            row.add(rs.getDate(4));
                            break;
                        case 7:
                            row.add(rs.getString(3));
                            break;
                        case 8:
                            row.add(rs.getString(2));
                            break;
                        case 9:
                            row.add(rs.getString(1));
                            break;
                    }
                }
                model.addRow(row);
            }

            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public static void EmpruntTableSearch(String statement, JTable table) {
        try {
            SetConnection();
            Statement st = con.createStatement();
            ResultSet rs;
            String strSelect;
            strSelect = "select * , DATEDIFF(date_of_return,CURDATE()) as diff from " + statement;
            rs = st.executeQuery(strSelect);
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {
                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    switch (i) {
                        case 1:
                            row.add(rs.getString("diff"));
                            break;
                        case 2:
                            row.add(rs.getDate(7));
                            break;
                        case 3:
                            row.add(rs.getDate(6));
                            break;
                        case 4:
                            row.add(rs.getString(5));
                            break;
                        case 5:
                            row.add(rs.getString(4));
                            break;
                        case 6:
                            row.add(rs.getString(3));
                            break;
                        case 7:
                            row.add(rs.getString(2));
                            break;
                        case 8:
                            row.add(rs.getString(1));
                            break;
                    }
                }
                model.addRow(row);
            }

            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

}
