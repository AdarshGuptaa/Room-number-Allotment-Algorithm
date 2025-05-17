package building.occupant;

public class Occupant {
    public String rollNumber;
    private String name;
    private Long phNumber;
    private String email;
    public String getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPhNumber() {
        return phNumber;
    }
    public void setPhNumber(Long phNumber) {
        this.phNumber = phNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
