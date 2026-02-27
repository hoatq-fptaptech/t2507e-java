package main.dao;

import main.database.Database;
import main.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao{
    @Override
    public ArrayList<Student> getAll(){
        ArrayList<Student> arr = new ArrayList<>();
        try {
            Database db = Database.getInstance();
            Statement st = db.getStatement();
            String sql = "SELECT * FROM students";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                arr.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDate("dob").toLocalDate(),
                        rs.getInt("mark")
                ));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return arr;

    }

    @Override
    public boolean create(Student student) {
        try {
            Database db = Database.getInstance();
            String sql = "INSERT INTO students(name,dob,mark) VALUES(?,?,?)";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1,student.getName());
            pt.setString(2,student.getDob().toString());
            pt.setInt(3,student.getMark());
            return pt.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
