package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.book;

public class BookJdbcDao {
	
	private PreparedStatement ptmt = null;
	private ResultSet rs = null;

	public BookJdbcDao() {
	}
	
	
	public void findAll(Connection conn) throws SQLException
	{
		//to do
		
	}
	
	public void delete(Connection conn, int id) throws SQLException
	{
		String sql = "delete from tb_books where id=?";
		try{
			ptmt = conn.prepareStatement(sql);
			// 對SQL語句中的第一個占位符賦值
			ptmt.setInt(1, id);
			// 執行更新操作
			ptmt.executeUpdate();
			
		}finally{
			if (null!=ptmt) {
				ptmt.close();
			}
			
			if (null!=conn) {
				conn.close();
			}
			
		}
		
	}
	
	public void update(Connection conn, int id ,int bookcount) throws SQLException
	{
		//to do
		
	}
}
	