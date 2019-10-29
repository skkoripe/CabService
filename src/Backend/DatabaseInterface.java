package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatabaseInterface {

    private Connection connection;
    public DatabaseInterface(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/CabService","root",Constants.password);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public int check(String user_id,String password){
        try {
            Statement statement = connection.createStatement();
            String query="select wallet from user where user_id='"+user_id+"' and password='"+password+"'";
            System.out.println(query);
            ResultSet resultSet=statement.executeQuery(query);
            if(resultSet.next()){
                return resultSet.getInt(1);
            }
        }
        catch (Exception e){
                System.out.println(e);
        }
        return -1;
    }

    public int check(String user_id){
        try{
            Statement statement=connection.createStatement();
            String query="select * from user where user_id='"+user_id+"'";
            ResultSet resultSet=statement.executeQuery(query);
            if(resultSet.next()){
                return -2;
            }
            else
                return 1;
        }
        catch (Exception e){
            System.out.println("error at check(user_id)");
            return 0;
        }
    }

    public void addMoney(String user_id,int money){
        try{
            Statement statement=connection.createStatement();
            String query="update user set wallet=wallet+"+money+" where user_id='"+user_id+"'";
            System.out.println(query);
            statement.executeUpdate(query);
        }
        catch (Exception e){
            System.out.println("error while adding money");
        }
    }

    public boolean store(String user_name,String user_id,String phone_no,String email_id,String password){
        System.out.println("ok1");
        String query="insert into user values("+"'"+user_name+"',"+"'"+user_id+"',"+phone_no+","+"'"+email_id+"',"+"'"+password+"',300)";
        System.out.println(query);
        try {
            Statement statement = connection.createStatement();
            System.out.println(statement.executeUpdate(query));
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
