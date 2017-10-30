package mysql.exercise02;

/*
created by PopoPenguin on 10/30/17
*/

import mysql.exercise02.Student;

import java.sql.*;
import java.util.ArrayList;

public class MyUniversityAccess {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {
        MyUniversityAccess example = new MyUniversityAccess();


        try {
            example.readDataBase();
        } catch (Exception e){
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void readDataBase() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/University?" +
                    "user=root&password='password'&useSSL=false");

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from University.students;");

            ArrayList<Student> student = mapResultsSetToObjects(resultSet);

            for (Student c : student){
                System.out.println(c.toString());
            }


        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }


    private ArrayList<Student> mapResultsSetToObjects(ResultSet resultSet) throws SQLException {

        ArrayList<Student> retList = new ArrayList();

        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Student s = new Student();
            s.setId(resultSet.getInt("id"));
            s.setF_name(resultSet.getString("f_name"));
            s.setL_name(resultSet.getString("l_name"));
            s.setP_language(resultSet.getString("p_language"));
            s.setEmail(resultSet.getString("email"));


            retList.add(s);
        }
        return retList;
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {

        }
    }

}