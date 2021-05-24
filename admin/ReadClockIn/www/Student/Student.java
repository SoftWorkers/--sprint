package ReadClockIn.www.Student;

public class Student {
    private int id; //id
    private String sno;  //学号
    private String name;   //姓名
    private String major;  //专业
    private String grade;  //年级
    private String loginAccount;  //账号
    private String passwd;  //密码
    private String count;  //打卡次数

    public Student() {
        super();
    }

    public Student(String sno) {
        super ();
        this.sno = sno;
    }

    public Student(String sno, String name, String major, String grade, String loginAccount, String passwd, String count) {
        super();
        this.sno = sno;
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.loginAccount = loginAccount;
        this.passwd = passwd;
        this.count = count;
    }

    public Student(int id, String sno, String name, String major, String grade, String loginAccount, String passwd, String count) {
        super();
        this.id = id;
        this.sno = sno;
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.loginAccount = loginAccount;
        this.passwd = passwd;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
