 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;


/**
 *
 * @author Hoàng Đình Hiếu
 */
public class JDBCUtil {
    public static Connection getConnection(){
        Connection c = null;      
        try {
            // register the oracle JDBC driver with DriverManager
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            // Các thông số
            String url = "jdbc:mysql://localhost:3306/nhasach";
            String username = "root";
            String password ="";
            
            // Tạo kết nối
            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            //Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return c;  
    }
    
    public static void closeConnection(Connection c){
        try{
            if(c!=null){
                c.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void printInfo(Connection c){
        if(c!=null){
            try {
                DatabaseMetaData mtdt = c.getMetaData();
                System.out.println(mtdt.getDatabaseProductName());
                System.out.println(mtdt.getDatabaseProductVersion());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
