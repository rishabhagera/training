import java.net.ConnectException;
import java.sql.*;
import java.util.Scanner;
import javax.lang.model.type.NullType;

// progrma of callable statement
public class database {

    static String url = "jdbc:mysql://localhost:3306/colloge";
    static String user = "root";
    static String pass = "Akvi9925";
    static String qur;

    public static void Menu() {
        System.out.println("1.Exit");
        System.out.println("2.Create Database");
        System.out.println("3.Read All Data Database");
        System.out.println("4.Insert Data In DataBase");
        System.out.println("5.Delete data In Database");
        System.out.println("6.Search data In Databse");
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    public static void insertData(int id, String name, String post, int sal, String city) throws Exception {

        qur = "INSERT INTO emp (id, name, post, sal ,city) VALUES (?, ?, ?, ?, ?)";

        Connection conn = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = conn.prepareStatement(qur);

        try {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, post);
            pstmt.setInt(4, sal);
            pstmt.setString(5, city);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting data Unsucces: " + e.getMessage());
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int ch;
        String qur;
        boolean exit = false;
        Connection conn = DriverManager.getConnection(url, user, pass);

        do {

            Menu();
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            // while (True) {
            switch (ch) {
                case 1:
                    System.out.println("You are Exiting the program");
                    if (ch == 1) {
                        return;
                    }
                    break;
                case 2:

                    qur = "insert into emp values(?,?)";
                    PreparedStatement pst = conn.prepareStatement(qur);

                    // ResultSet rs = st.executeQuery(qur);

                    conn.close();

                    break;
                case 3:
                    qur = "select * from emp";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(qur);

                    while (rs.next()) {

                        String tabel = "";
                        tabel = rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":" + rs.getInt(4)
                                + ":"
                                + rs.getString(5);
                        System.out.println(tabel);
                    }

                    conn.close();
                    break;
                case 4:
                    System.out.println("Enter Id : ");
                    int id = sc.nextInt();
                    System.out.println("Enter Name : ");
                    String name = sc.next();
                    System.out.println("Enter Post : ");
                    String post = sc.next();
                    System.out.println("Enter Salary : ");
                    int sal = sc.nextInt();
                    System.out.println("Enter city : ");
                    String city = sc.next();

                    insertData(id, name, post, sal, city);
                    break;

                case 5:
                    System.out.println("Deleting the data");
                    break;

                default:
                    System.out.println("Please Enter valid ...ch");
                    break;
            }
            if (!exit) {
                System.out.print("Press Enter to continue...");
                sc.nextLine(); // Wait for Enter key press
                System.out.println(); // Extra newline for separation
            }

        } while (ch != 1);
    }
}
