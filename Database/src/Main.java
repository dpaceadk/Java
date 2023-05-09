import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
        System.out.println("connection successful");
        Statement stm = conn.createStatement();
        ResultSet res = stm.executeQuery("select * from new_table");
        while (res.next()) {
            String name = res.getNString("name");
            System.out.println(name);
        }
        stm.executeUpdate("UPDATE new_table SET name='NEW_NAME' WHERE id=2");
        stm.execute("DELETE FROM new_table WHERE id=2 ");

        // prepared statement!
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM new_table WHERE id=? AND address=?");
        preparedStatement.setInt(1,10);
        preparedStatement.setString(2,"test");
        ResultSet resultSet = preparedStatement.executeQuery();
         while (res.next()) {
            String name = res.getNString("name");
            System.out.println(name);
        }
    }
}