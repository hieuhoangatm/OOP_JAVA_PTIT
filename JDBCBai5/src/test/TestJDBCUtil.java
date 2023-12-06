/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import database.JDBCUtil;
import java.sql.*;
/**
 *
 * @author Hoàng Đình Hiếu
 */
public class TestJDBCUtil {
   public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            //B1: Tạo kết nối
            Connection  connection  = JDBCUtil.getConnection();
            
            //B2:Tạo ra đối tượng statement
            Statement st = connection.createStatement();
            
            //B3: Thực thi câu lệnh SQL
            String sql = "INSERT INTO persons(last_name,first_name,gender,dob,income)"
                    + "VALUES (\"Tran\" ,\"Thi\", \"C\", \"2000-09-10\", 10000000)";
            int check =  st.executeUpdate(   sql);
            
            
            //B4: Xử lý kết quả
            System.out.println("Số dòng thay đổi: "+ check);
            if(check> 0){
                System.out.println("Thêm dữ liệu thành công");
            }
            else{
                System.out.println("Thêm dữ liệu thất bại");
            }
            // B5: ngắt kết nối
            JDBCUtil.closeConnection(connection);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
