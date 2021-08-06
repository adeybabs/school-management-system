package School.Management.System;

/**
 * This class is created for keeping track of the teachers details
 * The id,names and salary
 */
public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    /**
     * A constructor responsible for creating Teacher object
     * @param id is the unique id of a teacher
     * @param firstName is the first name of the teacher
     * @param lastName is the family name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;

    }

    /**
     *
     * @return Id of the teacher
     */
    public int getId(){
        return this.id;
    }

    /**
     *
     * @return the first name of the teacher
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     *
     * @return the last name of the teacher
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     *
     * @return the salary of the teacher
     *
     */
    public int getSalary(){
        return this.salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }
}
