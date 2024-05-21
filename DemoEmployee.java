class EmpPersonalInfo {
    private String ename;
    private String emailId;
    private String resaddr;
    private int mobileno;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getResaddr() {
        return resaddr;
    }

    public void setResaddr(String resaddr) {
        this.resaddr = resaddr;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "EmpPersonalInfo [Ename=" + ename + ", EmailId=" + emailId + ", ResAddr=" + resaddr + ", MobileNo=" + mobileno + "]";
    }
}

public class DemoEmployee {

    public static void main(String[] args) {
        EmpPersonalInfo epr = new EmpPersonalInfo();
        epr.setEname("Amar Sinh");
        epr.setEmailId("amars@mail.com");
        epr.setResaddr("paldi");
        epr.setMobileno(78954);

        System.out.println(epr);  

        EmpPersonalInfo epr1 = new EmpPersonalInfo();
        epr1.setEname("Aman");
        epr1.setResaddr("Ahmedabad");

        System.out.println(epr1);  
    }
}
