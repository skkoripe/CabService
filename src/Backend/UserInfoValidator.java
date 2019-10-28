package Backend;



public class UserInfoValidator {

    private DatabaseInterface databaseInterface;

    public UserInfoValidator(DatabaseInterface databaseInterface){
        this.databaseInterface=databaseInterface;
    }

    public int validate(String user_name,String user_id,String phone_no,String email_id,String password){
        if(user_name==null || user_id==null || phone_no==null || email_id==null || password==null){
            return -1;
        }
        else{
            try{
                Integer.parseInt(phone_no);
            }
            catch (NumberFormatException e){
                return -1;
            }
        }
        return databaseInterface.check(user_id);
    }
}
