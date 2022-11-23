import java.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class dbTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Class.forName("org.apache.derby.jdbc.ClientDriver");
        String Url = "jdbc:derby://localhost:1527/EmployeeDB"; //Java DB 連線字串
        String user = "test";
        String pass = "tiger";
        String str = "insert into USERACCOUNT(uid,account,password) values(?,?,?)";
        try (   Connection con = DriverManager.getConnection(Url, user, pass);
                Statement stmt = con.createStatement();
                PreparedStatement pstmt = con.prepareStatement("select * from USERACCOUNT");
                JdbcRowSet jdrs = RowSetProvider.newFactory().createJdbcRowSet();
                ResultSet rs = pstmt.executeQuery()) {
            System.out.println("資料庫連線成功");
            while (rs.next()) { // 取得下一筆資料，若成功獲取到資料 next() 會回傳 true
                // 讀取目前這筆資料的各項欄位
                int uid = rs.getInt("UID");
                String account = rs.getString("ACCOUNT");
                String password = rs.getString("PASSWORD");
                String address = rs.getString("ADDRESS");
                
                // 輸出目前所讀到的員工資料
                System.out.println(uid + " " + account + " " + password + " " + address);
            }
            /* 使用陣列新增資料的方法
            String[] str = {
                "insert into USERACCOUNT(uid,account,password) values(2,'Tome','123')",
                "insert into USERACCOUNT(uid,account,password) values(3,'Mary','111')",
                "insert into USERACCOUNT(uid,account,password) values(4,'Helen','222')"
            };
            // 用加強版 for 迴圈，把資料一筆一筆新增
            int count = 0;
            for (String tmp : str) {
                count = stmt.executeUpdate(tmp);
                System.out.println("新增:" + count + "筆");
            }*/
            /* 預處理語句
            pstmt.setInt(1, 5);
            pstmt.setString(2, "Ben");
            pstmt.setString(3, "125");
            int count = pstmt.executeUpdate();
            System.out.println("新增 " + count + " 筆資料");*/
            jdrs.setUrl(Url);
            jdrs.setUsername(user);
            jdrs.setPassword(pass);
            jdrs.setCommand("select * from USERACCOUNT;");            
            System.out.println("資料庫連線成功 並取得查詢結果");           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
            Class c = Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("類別名稱：" + c.getName());
            System.out.println("是否為介面：" + c.isInterface());
            System.out.println("是否為基本型態：" + c.isPrimitive());
            System.out.println("是否為陣列：" + c.isArray());
            System.out.println("父類別：" + c.getSuperclass().getName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定類別名稱");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的類別");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
