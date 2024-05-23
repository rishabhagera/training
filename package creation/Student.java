// src/rishabh/Student.java
package rishabh;

public class Student {
    private String rollNo;
    private String name;
    private String subject;

    public Student(String rollNo, String name, String subject) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
    }

    public String getRollNo() {
        return rollNo;
    }

    // Setter for rollNo
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
  public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
