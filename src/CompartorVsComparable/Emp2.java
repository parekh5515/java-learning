package CompartorVsComparable;

public class Emp2 {
    private String name;
    private String phoneNo;
    private int empId;

    public Emp2(String name, String phoneNo, int empId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Emp2{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", empId=" + empId +
                '}';
    }
}
