
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class dbTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        */
        String url = "jdbc:derby://localhost:1527/EmployeeDB"; //Java DB 連線字串
        String user = "test";
        String pass = "tiger";
        String str = "insert into tb_books(name,price,bookcount,author) values(?,?,?,?)";

        try (Connection con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement();
                PreparedStatement pstmt = con.prepareStatement(str);
                ResultSet rs = stmt.executeQuery("select * from tb_books")) {
            System.out.println("資料庫連線成功");
            while (rs.next()) { // 取得下一筆資料，若成功獲取到資料 next() 會回傳 true
                // 讀取目前這筆資料的各項欄位
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int bookcount = rs.getInt("bookcount");
                String author = rs.getString("author");

                // 輸出目前所讀到的員工資料
                System.out.println(id + " " + name + " " + price + " " + bookcount + " " + author);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
