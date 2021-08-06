package School.Management.System;

/**
 * This class is responsible for information concerning the students
 * We will keep track of name,id,fees,grade and other important info
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private String attendancePercent;
    private int paidFees;
    private int totalFees;

    /**
     * To create a new student by initializing
     * fees for all student is 100,000 per year
     * fees initial payment = 0
     * @param id is the unique integer for a student
     * @param firstName is the name of the student
     * @param lastName is the family name of the student
     * @param grade is the grade the student gets
     */
    public Student(int id,String firstName,String lastName, int grade,String attendancePercent){

        this.id =id;
        this.firstName =firstName;
        this.lastName =lastName;
        this.grade =grade;
        this.attendancePercent =attendancePercent;
        this.paidFees = 0;
        this.totalFees = 100000;

    }

    /**
     * For updating student grades
     * @param grade is the present grade of the student
     */
    public void setGrade(int grade){
this.grade =grade;
    }

    /**
     * For updating the percentage number of times a student was present in school
     * @param attendancePercent is the percentage of total attendance
     */
    public void setAttendancePercent(String attendancePercent){
        this.attendancePercent =attendancePercent;
    }

    /**
     * keep adding payIn into paidFees for update
     * @param payIn is the fees the student pay
     */
    public void updatePaidFees(int payIn){
        paidFees += payIn;
        School.updateSchoolMoneyEarned(paidFees);

    }

    /**
     *
     * @return id of the students
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return first name of the students
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return surname of the students
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return grade the student is
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return attendance percentage the student has
     */
    public String getAttendancePercent() {
        return attendancePercent;
    }


    /**
     *
     * @return fees paid by the students
     */
    public int getPaidFees() {
        return paidFees;
    }


    /**
     *
     * @return the total fees students are meant to pay
     */
    public int getTotalFees() {
        return totalFees;
    }

    /**
     *
     * @return the remaining fees yet to be paid
     */
    public int getRemainingFees(){
        return totalFees - paidFees;
    }
}
