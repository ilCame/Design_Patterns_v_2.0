package templatemethod;

public class User extends Record{
    //User user = new User();
    private String passw;
    private String userName;
    private boolean validation;
    private String saveStats;

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean validate() {
        return validation = this.passw.equals("password")
                  && this.userName.equals("user");
    }

    @Override
    public void beforeSave(){
        if(validation){
            saveStats = "you can now save";
        }
    }
}
