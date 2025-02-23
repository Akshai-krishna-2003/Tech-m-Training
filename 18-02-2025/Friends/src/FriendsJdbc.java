import java.sql.*;
import java.util.Scanner;

public class FriendsJdbc {

    private static final String url = "jdbc:mysql://localhost:3306/practice1";
    private static final String user = "root";
    private static final String password = "Akshay@13";


    private static void addData(int sno, String fn, String ln, String city, String ph) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);

        String stmt = String.format("INSERT INTO friends VALUES (%s,'%s','%s','%s','%s');",sno,fn,ln,city,ph);

        PreparedStatement ps = conn.prepareStatement(stmt);
        int v = ps.executeUpdate();
        System.out.println("Number of rows affected: " + v);
        ps.close();
        conn.close();
        System.out.println("Inserted friend: " + sno + " successfully!");

    }

    private static void deleteData(int sno) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);

        String stmt = String.format("DELETE FROM friends WHERE sno = %d;",sno);
        PreparedStatement ps = conn.prepareStatement(stmt);
        int v = ps.executeUpdate();
        System.out.println("Number of rows affected: " + v);
        ps.close();
        conn.close();
        System.out.println("Deleted friend: " + sno + " successfully!");
    }

    private static void updateAllData(int sno, String fn, String ln, String city, String ph) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);

        String stmt = String.format("UPDATE friends SET fname = '%s', lname = '%s', city = '%s', phno = '%s'  WHERE sno = %d;",fn,ln,city,ph,sno);
        PreparedStatement ps = conn.prepareStatement(stmt);
        int v = ps.executeUpdate();
        System.out.println("Number of rows affected: " + v);
        ps.close();
        conn.close();
        System.out.println("Updated friend: " + sno + " successfully!");
    }

    private static void updateFName(int sno, String fn) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        String stmt = String.format("UPDATE  friends SET fname = '%s' WHERE sno = %d;",fn,sno);
        PreparedStatement ps = conn.prepareStatement(stmt);
        int v = ps.executeUpdate();
        System.out.println("Number of rows affected: " + v);
        ps.close();
        conn.close();
        System.out.println("Updated friend: " + fn + " successfully!");

    }

    private static void updateLName(int sno, String ln) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        String stmt = String.format("UPDATE friends set lname = '%s' WHERE sno = %d;",ln,sno);
        PreparedStatement ps = conn.prepareStatement(stmt);
        int v = ps.executeUpdate();
        System.out.println("Number of rows affected: " + v);
        ps.close();
        conn.close();
        System.out.println("Updated friend: " + ln + " successfully!");

    }

    private static void updateCity(int sno, String city) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        String stmt = String.format("UPDATE friends SET city = '%s' WHERE sno = %d;",city,sno);
        PreparedStatement ps = conn.prepareStatement(stmt);
        int v = ps.executeUpdate();
        System.out.println("Number of rows affected: " + v);
        ps.close();
        conn.close();
        System.out.println("Updated friend: " + city + " successfully!");

    }

    private static void updatePh(int sno, String ph) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        String stmt = String.format("UPDATE friends SET phno = '%s' WHERE sno = %d;",ph,sno);
        PreparedStatement ps = conn.prepareStatement(stmt);
        int v = ps.executeUpdate();
        System.out.println("Number of rows affected: " + v);
        ps.close();
        conn.close();
        System.out.println("Updated friend: " + ph + " successfully!");

    }

    private static void displayFriends() throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        String stmt = "SELECT * FROM friends";
        PreparedStatement ps = conn.prepareStatement(stmt);
        ResultSet rs = ps.executeQuery();
        int i = 1;
        while (rs.next()) {
            int sno = rs.getInt("sno");
            String fn = rs.getString("fname");
            String ln = rs.getString("lname");
            String city = rs.getString("city");
            String ph = rs.getString("phno");
//            int v = rs.getInt("v");
            System.out.println("\nSno of friend "+i +" is: " + sno);
            System.out.println("Fname: "+fn);
            System.out.println("Lname: "+ln);
            System.out.println("City: "+city);
            System.out.println("Phno: "+ph);
            i++;
        }
        rs.close();
        ps.close();
        conn.close();
    }

    public static void displayOneFriend(int sno) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        String stmt = String.format("SELECT * FROM friends WHERE sno = %d;",sno);
        PreparedStatement ps = conn.prepareStatement(stmt);
        ResultSet rs = ps.executeQuery();



        if (rs.next()) {
            int sno2 = rs.getInt("sno");
            String fn = rs.getString("fname");
            String ln = rs.getString("lname");
            String city = rs.getString("city");
            String ph = rs.getString("phno");
            System.out.println("\nSno: "+ sno2);
            System.out.println("Fname: "+fn);
            System.out.println("Lname: "+ln);
            System.out.println("City: "+city);
            System.out.println("Phno: "+ph);
        }
        else{
            System.out.println("No such friend");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Friends Database Management ===");
            System.out.println("1. Add Friend");
            System.out.println("2. Delete Friend");
            System.out.println("3. Update Entire Details");
            System.out.println("4. Update First Name");
            System.out.println("5. Update Last Name");
            System.out.println("6. Update City");
            System.out.println("7. Update Phone Number");
            System.out.println("8. Display All Friends");
            System.out.println("9. Display single Friend");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter SNo: ");
                        int sno = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter First Name: ");
                        String fn = scanner.nextLine();
                        System.out.print("Enter Last Name: ");
                        String ln = scanner.nextLine();
                        System.out.print("Enter City: ");
                        String city = scanner.nextLine();
                        System.out.print("Enter Phone Number: ");
                        String ph = scanner.nextLine();
                        addData(sno, fn, ln, city, ph);
                        break;

                    case 2:
                        System.out.print("Enter SNo to delete: ");
                        sno = scanner.nextInt();
                        deleteData(sno);
                        break;

                    case 3:
                        System.out.print("Enter SNo: ");
                        sno = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New First Name: ");
                        fn = scanner.nextLine();
                        System.out.print("Enter New Last Name: ");
                        ln = scanner.nextLine();
                        System.out.print("Enter New City: ");
                        city = scanner.nextLine();
                        System.out.print("Enter New Phone Number: ");
                        ph = scanner.nextLine();
                        updateAllData(sno, fn, ln, city, ph);
                        break;

                    case 4:
                        System.out.print("Enter SNo: ");
                        sno = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New First Name: ");
                        fn = scanner.nextLine();
                        updateFName(sno, fn);
                        break;

                    case 5:
                        System.out.print("Enter SNo: ");
                        sno = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Last Name: ");
                        ln = scanner.nextLine();
                        updateLName(sno, ln);
                        break;

                    case 6:
                        System.out.print("Enter SNo: ");
                        sno = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New City: ");
                        city = scanner.nextLine();
                        updateCity(sno, city);
                        break;

                    case 7:
                        System.out.print("Enter SNo: ");
                        sno = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Phone Number: ");
                        ph = scanner.nextLine();
                        updatePh(sno, ph);
                        break;

                    case 8:
                        displayFriends();
                        break;

                    case 9:
                        System.out.println("Enter sno of friend: ");
                        int s = scanner.nextInt();
                        displayOneFriend(s);
                        break;

                    case 10:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
