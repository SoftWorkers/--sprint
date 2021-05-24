package Eighth.login;

public class User {
    public User() {
    }

    public User(String loginAccount, String passWord) {
        super();
        this.loginAccount = loginAccount;
        this.passWord = passWord;
    }
    public User(String loginAccount) {
        super();
        this.loginAccount = loginAccount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public String setPassWord(String passWord) {
        this.passWord = passWord;
        return passWord;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public String setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
        return loginAccount;
    }

    public String getUserName() {
        return userName;
    }

    public String setUserName(String userName) {
        this.userName = userName;
        return userName;
    }

    public String getMajor() {
        return major;
    }

    public String setMajor(String major) {
        this.major = major;
        return major;
    }
    public int getCount() {
        return count;
    }

    public int setCount(int count) {
        this.count = count;
        return count;
    }

    private int id;
    private String loginAccount;
    private String userName;
    private String passWord;
    private String major;
    private int count;
}
