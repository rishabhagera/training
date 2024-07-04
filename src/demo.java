import java.net.ConnectException;
import java.sql.*;

public class demo {

    public static void main(String[] args) throws Exception {

        String qur = "select * from emp";
        // String qur = "select Name from emp where id=1005";
        String url = "jdbc:mysql://localhost:3306/colloge";
        String user = "root";
        String pass = "Akvi9925";

        Connection conn = DriverManager.getConnection(url, user, pass);

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(qur);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);

        conn.close();

    }
}
