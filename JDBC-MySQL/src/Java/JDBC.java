package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JDBC {
    // 載入資料庫驅動  com.mysql.jdbc.Driver
        private static String dbdriver = "com.mysql.cj.jdbc.Driver";  // 因為MySQL是8.0版本，所以需要加上cj，如果是5.0版本就不用
        // 獲取 mysql 連線地址
        private static String dburl = "jdbc:mysql://127.0.0.1:3306/demo_db?serverTimezone=GMT%2B8&useSSL=false&characterEncoding=utf-8";  
        		//這裡的?serverTimezone=GMT%2B8很重要，容易因為這個出錯
        // 資料庫 username
        private static String username = "root";
        // 資料庫密碼
        private static String userpassword = "123456";
        // 獲取一個資料的連線
        public static Connection conn = null;
        // 獲取連線的一個狀態

		// 下面是一個例子，其中demo_database是資料庫名，後面是一條查詢語句
        public static void main(String[] args) {
            List<List<Object>> x = getData("demo_db",
                    "select * from users");
            System.out.println(x);
        }

    
     // 獲取資料庫連線
    private static Connection getConn(String myProjName) {
        Connection conn = null;
        try {
            Class.forName(dbdriver);            
            String myjdbcUrl = dburl.replace("demo_db", myProjName);
            conn = DriverManager.getConnection(myjdbcUrl, username, userpassword);
        } catch (ClassNotFoundException |SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    /**
     * 關閉資料庫連線
     * 
     * @param rs
     * @param ps
     * @param conn
     */
    private static void closeAll(ResultSet rs, PreparedStatement ps,
            Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn == null)
            return;
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查表，返回行的列表，每個列表中包含列的列表。
     * 
     * @param ProjName
     * @param sql
     * @return
     */
    public static List<List<Object>> getData(String ProjName, String sql) {
        Connection conn = getConn(ProjName);
        PreparedStatement ps = null;
        List<List<Object>> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            int columnCount = md.getColumnCount();
            while (rs.next()) {
                List<Object> lst = new ArrayList<>();
                for (int i = 1; i <= columnCount; ++i) {
                    lst.add(rs.getObject(i) == null ? "" : rs.getObject(i));
                }
                list.add(lst);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(rs, ps, conn);
        }
        return list;
    }
}