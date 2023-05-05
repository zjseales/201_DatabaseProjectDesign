/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

import java.util.Collection;

/** Student.java
 *  INFO201, Lab08
 * 
 * Class representing a student.
 * @author Zac Seales
 */
public class Student {
    
    private Integer studentId;
    private String familyName;
    private String givenName;
    private String phone;
    private String schoolEmail;
    private String homeEmail;
    private String secondaryInstruments;
    
    private Collection<ClassEnrolment> classes;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getHomeEmail() {
        return homeEmail;
    }

    public void setHomeEmail(String homeEmail) {
        this.homeEmail = homeEmail;
    }

    public String getSecondaryInstruments() {
        return secondaryInstruments;
    }

    public void setSecondaryInstruments(String secondaryInstruments) {
        this.secondaryInstruments = secondaryInstruments;
    }
    
    public void setClasses(Collection<ClassEnrolment> classes){
        this.classes = classes;
    }
    
    public Collection<ClassEnrolment> getClasses(){
        return classes;
    }
    
}
