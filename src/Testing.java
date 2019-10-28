import java.sql.*;

public class Testing {

    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/CabService","root","2168");
//here sonoo is database name, root is username and password
            Statement statement = con.createStatement();
            ResultSet resultSet=statement.executeQuery("select exists(select * from user where user_id='skkoripe' and password='2168')");
            if(resultSet.next() && resultSet.getInt(1)==1)
            System.out.println("ok");
        }catch(Exception e){ System.out.println(e);}
    }
}
