package JDBC;

import model.Homework;
import model.Student;
import model.StudentHomework;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class database {

    public static void main(String[] args) {


    }
    //提交作业在student_homework表中插入信息
    public static void addStudentHomework(StudentHomework sh){

        String dburl = "jdbc:mysql://127.0.0.1:3306/homework?&useSSL=false&serverTimezone=UTC";
        String sqlString = "INSERT INTO student_homework values(?,?,?,?,?,?,null )";

        try
        {
            Connection connection = databasepool.getHikariDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement(sqlString);
            statement.setInt(1,sh.getId());
            statement.setLong(2,sh.getStudentId());
            statement.setLong(3,sh.getHomeworkId());
            statement.setString(4,sh.getHomeworkTitle());
            statement.setString(5,sh.getHomeworkContent());
            statement.setDate(6,  sh.getCreateTime());
            boolean i= statement.execute();
            if (i)
            {
                System.out.println("作业提交成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



 //查询学生作业
    public static List<StudentHomework> selectAll(){



        String dburl = "jdbc:mysql://127.0.0.1:3306/homework?&useSSL=false&serverTimezone=UTC";
        String sqlString = "SELECT * FROM student_homework";



        List<StudentHomework> list = new ArrayList<>();


        try
        {
            Connection connection = DriverManager.getConnection(dburl,"root","123456");
            Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sqlString);
                    // 获取执行结果
                    while (resultSet.next()){
                        StudentHomework sh = new StudentHomework();
                        sh.setId(resultSet.getInt("id"));
                        sh.setStudentId(resultSet.getLong("student_id"));
                        sh.setHomeworkId(resultSet.getLong("homework_id"));
                        sh.setHomeworkTitle(resultSet.getString("homework_title"));
                        sh.setHomeworkContent(resultSet.getString("homework_content"));
                        sh.setCreateTime(resultSet.getDate("create_time"));
                        list.add(sh);
                    }
                } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //老师操作：查询学生
    public static List<Student> SelectAllStudent()
    {
        List<Student> studentlist= new ArrayList<>();
        String dburl = "jdbc:mysql://127.0.0.1:3306/homework?&useSSL=false&serverTimezone=UTC";
        String sqlString = "SELECT * FROM student";
        try( Connection connection = databasepool.getHikariDataSource().getConnection()){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sqlString)){
                    // 获取执行结果
                    while (resultSet.next()){
                      Student st= new Student();
                      st.setId(resultSet.getLong("id"));
                      st.setSname(resultSet.getString("sname"));
                      st.setCreate_time(resultSet.getDate("create_time"));
                      studentlist.add(st);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentlist;
    }
    //老师操作添加学生
    public static  void addStudent(Student st){

        String dburl = "jdbc:mysql://127.0.0.1:3306/homework?&useSSL=false&serverTimezone=UTC";
        String sqlString = "INSERT INTO student values(?,?,?,null )";


        List<Student> list= new ArrayList<>();

        try( Connection connection = databasepool.getHikariDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement(sqlString) )

        {
            statement.setLong(1,st.getId());
            statement.setString(2,st.getSname());
            statement.setDate(3, st.getCreate_time());

            boolean i= statement.execute();
            if (! i)
            {
                System.out.println("学生添加成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addHomework(Homework homework){
        String dburl = "jdbc:mysql://127.0.0.1:3306/homework?&useSSL=false&serverTimezone=UTC";
        String sqlString = "INSERT INTO homework values(?,?,?,?,null )";

        List<Homework> list= new ArrayList<>();
        try( Connection connection = databasepool.getHikariDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement(sqlString) )

        {
            statement.setLong(1,homework.getId());
            statement.setString(2,homework.getTitle());
            statement.setString(3,homework.getContent());
            statement.setDate(4, (Date) homework.getCreate_time());

            boolean i= statement.execute();
            if (i)
            {
                System.out.println("添加作业成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
