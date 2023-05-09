import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
        System.out.println("connection success full");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from new_table");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            System.out.println(name);
        }

    }

}


