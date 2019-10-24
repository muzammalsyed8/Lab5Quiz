package DB;

import javax.xml.crypto.Data;
import java.sql.*;


public class DbConnection {
    private String dbURL = "jdbc:mysql://localhost:3306/lab5";
    private String username = "root";
    private String password = "";
    private Connection connection;
    public DbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,username,password);
            if(connection!=null){
                System.out.println("Success");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertData(int ID, String Username, String Password,String Email, Date DOB, int Phone, int Fee, String Course, String Gender ){
        try {
            String sqlQuery = "INSERT INTO quiz(id,name,password,email,dob,phone,fee,course,gender) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,ID);
            preparedStatement.setString(2,Username);
            preparedStatement.setString(3,Password);
            preparedStatement.setString(4,Email);
            preparedStatement.setString(5, String.valueOf(DOB));
            preparedStatement.setInt(6,Phone);
            preparedStatement.setInt(7,Fee);
            preparedStatement.setString(8,Course);
            preparedStatement.setString(9,Gender);


            int noOfRowsInserted = preparedStatement.executeUpdate();
            if(noOfRowsInserted>0){
                System.out.println(noOfRowsInserted + " rows inserted!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   /* public void displayRecords(){
        try {
            String sqlQuery = "SELECT * FROM registration";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            while (result.next()){

                System.out.println("Username: "+result.getString("username"));
                System.out.println("Password: "+result.getString("password"));
                System.out.println("Confirm Password: "+result.getString("confirm_password"));
                System.out.println("First Name: "+result.getString("fName"));
                System.out.println("Last Name: "+result.getString("lName"));
                System.out.println("Date of Birth: "+result.getDate("dob"));
                System.out.println("Email: "+result.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    public ResultSet displayRecords() {

        ResultSet result = null;
        try {
            String sqlQuery = "SELECT * FROM quiz";
            Statement statement = connection.createStatement();
            result = statement.executeQuery(sqlQuery);
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
            return result;
        }
    }
}
