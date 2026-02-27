package main.session7;

import main.database.Database;

import java.sql.*;
import java.time.LocalDate;

public class Demo1 {
    public static void main(String[] args){

        try {
            Database db = new Database();
            // lấy thông tin sinh viên
            String sql = "select * from students";

            Statement stt = db.getStatement();
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                Integer x = rs.getInt("id");
                String y = rs.getString("name");
                LocalDate z = rs.getDate("dob").toLocalDate();
                Integer t = rs.getInt("mark");
                System.out.println(x+"--"+y+"--"+z+"--"+t);
            }
            // thêm 1 sinh viên vào table
//            String sql1 = "insert into students(name,dob,mark) values('Phan Đức Hợp','2003-02-21',8)";
//            stt.execute(sql1);
            String sql2 = "INSERT INTO students(name,dob,mark) VALUES(?,?,?)";
            PreparedStatement pt = db.getPreparedStatement(sql2);
            pt.setString(1,"Nguyễn Công Tiến");
            pt.setDate(2,Date.valueOf("1990-09-27"));
            pt.setInt(3,9);
            pt.execute();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
