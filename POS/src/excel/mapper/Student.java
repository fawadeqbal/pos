package excel.mapper;

public class Student {
   
    private String regNo;
    private String prog;
    private String name;
    private String fatherName;
    private String nationality;
    private String status;
    private String group;
    private String cnic;
    private double fscMarks;
    private double sscMarks;

    public double getFscMarks() {
        return fscMarks;
    }

    public void setFscMarks(double fscMarks) {
        this.fscMarks = fscMarks;
    }

    public double getSscMarks() {
        return sscMarks;
    }

    public void setSscMarks(double sscMarks) {
        this.sscMarks = sscMarks;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getProg() {
        return prog;
    }

    public void setProg(String prog) {
        this.prog = prog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
public String toString() {
    return "{" +
            "\"regNo\":\"" + regNo + "\"" +
            ", \"prog\":\"" + prog + "\"" +
            ", \"name\":\"" + name + "\"" +
            ", \"fatherName\":\"" + fatherName + "\"" +
            ", \"nationality\":\"" + nationality + "\"" +
            ", \"status\":\"" + status + "\"" +
            ", \"group\":\"" + group + "\"" +
            "}";
}

}
