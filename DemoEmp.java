class EmployeeData {
    private String name;
    private String designation;
    private double basicSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    @Override
    public String toString() {
        return "EmployeeData [Name=" + name + ", Designation=" + designation + ", BasicSalary=" + basicSalary + "]";
    }
}

public class DemoEmp {

    public static void main(String[] args) {
        EmployeeData ed = new EmployeeData();
        ed.setName("Rishabh");
        ed.setDesignation("manager");
        ed.setBasicSalary(30000);

        System.out.println(ed);
    }
}
