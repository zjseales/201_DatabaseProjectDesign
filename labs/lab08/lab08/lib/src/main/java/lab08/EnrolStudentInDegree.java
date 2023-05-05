/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;
import javax.swing.*;

/** EnrolStudentInDegree.java
 *  INFO201, Lab08
 * 
 *  Class representing a new student enrolment.
 * @author Zac Seales
 */
public class EnrolStudentInDegree {
    
    private JTextField txtStudentID;
    private JComboBox cmbDegreeName;
    private ButtonGroup radGrpPaymentReceived;
    private JComboBox cmbStatus;
    private JButton btnFindStudent;
    private JButton btnSave;
    private JButton btnCancel;
    private Student student;
    private DegreeEnrolment enrolment;
    private EnrolmentDataStore dataStore;
    
    public void displayForm(){
        populateDegreeNames(dataStore.getDegreeNames());
        populateStatuses(dataStore.getDegreeEnrolmentStatuses());
        Student student = dataStore.findStudent(txtStudentID.getText());
        if(btnSave.pressed()){
            enrolment = dataStore.saveEnrolment();
            dataStore.enrolStudentInDegree(student, enrolment);
        } else if (btnCancel.pressed()){
            return;
        }
    }

    public EnrolmentDataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(EnrolmentDataStore dataStore) {
        this.dataStore = dataStore;
    }
    
    public void populateDegreeNames(Collection<String> degreeNames){
        cmbDegreeName = degreeNames;
    }
    
    public void populateStatuses(Collection<String> statuses){
        cmbStatus = statuses;
    }
    
}
