import java.sql.*;

public class Main {
    public static void main(String[]args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World");
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
        PreparedStatement preparedStatement = connection.prepareStatement("select * form db");
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet);
    }
}
