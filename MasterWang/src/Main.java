import java.sql.*;

public class Main {
    public static void main(String[]args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone =UTC","root","");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from inf_student");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.print(resultSet.getInt(1)+"\t");
            System.out.print(resultSet.getString(2)+"\t");
            System.out.print(resultSet.getString(3));
        }

    }
}
