
/*
 * import the package           --> Phone -->SQL Package
 * 1. Load or Register the driver --> sim card --> com.mysql.cj.Driver -->forName();
 * 2. Establish the Connection --> call the particular pe -->forName(parameters);
 * 4. Create the statement  --> Perpare the Question? --> createStatement();// Three types - ststements,prepard
 * 5. Execute the Query --> ask the Question --> executeQuery();
 * 6. Process the result   -->  Speak back
 * 7. Close the connection   --> hang up the call
 */

import java.sql.*;

public class demoConnJDBC {

    public static void main(String... args) throws Exception {

        // Class.forName("com.mysql.cj.jdbc.Driver");

        // String url = "jdbc:mysql://localhost:3306";
        String url = "jdbc:mysql://localhost:3306/colloge";
        String userName = "root";
        String pass = "Akvi9925";
        String q = "select Name from emp where id=1005";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, userName, pass); //
        // completed

        Statement st = conn.createStatement();
        ResultSet rset = st.executeQuery(q);

        rset.next();

        String name = rset.getString("Name");
        System.out.println(name);

        st.close();
        conn.close();
    }

}
