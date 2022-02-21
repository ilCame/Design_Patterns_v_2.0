package templatemethod;

public class Administrator extends Record{
    private String passw;
    private String userName;

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
        boolean validation;
        return validation = this.passw.equals("admin")
                && this.userName.equals("admin");
    }
}
