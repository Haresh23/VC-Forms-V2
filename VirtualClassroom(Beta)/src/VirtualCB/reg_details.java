package VirtualCB;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

public class reg_details extends OutputStream implements Serializable {
    private String Name;
    private String Phone;
    private String Reg_no;
    private String Course;
    private String YearEnrolled;
    private String Email;
    private String Password;
    private String Designation;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPhone() {
        return Phone;
    }

    public String getReg_no() {
        return Reg_no;
    }

    public void setReg_no(String reg_no) {
        Reg_no = reg_no;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getCourse() {
        return Course;
    }

    public void setYearEnrolled(String yearEnrolled) {
        YearEnrolled = yearEnrolled;
    }

    public String getYearEnrolled() {
        return YearEnrolled;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getDesignation() {
        return Designation;
    }

    @Override
    public void write(int b) throws IOException {

    }
}