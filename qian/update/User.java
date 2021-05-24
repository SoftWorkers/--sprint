package Eighth.update;

public class User {
    public User() {
    }
    public User(String userName,String dept,String loginAccount,String passWord){
        super();
        this.userName=userName;
        this.loginAccount=loginAccount;
        this.passWord=passWord;
        this.dept=dept;
    }
    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    private String loginAccount;
    private String userName;
    private String passWord;
    private String dept;
}
