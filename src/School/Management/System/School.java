package School.Management.System;

import java.util.List;

/**
 * For teacher and student we'll use arraylist
 * Because we have an unidentified, dynamic number of both
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int schoolMoneyEarned;
    private static int schoolMoneySpent;

    /**
     * constructor
     * new school object is created
     * @param teachers is the list of teachers in the school
     * @param students is the list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        schoolMoneyEarned=0;
        schoolMoneySpent=0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher the teacher to be added for update
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add a student to the school
     * @param student is the student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money the school earned
     */
    public int getSchoolMoneyEarned() {
        return schoolMoneyEarned;
    }

    /**
     *
     * @param MoneyEarned money to be added to the schoolMoneyEarned
     */
    public static void updateSchoolMoneyEarned(int MoneyEarned) {
        schoolMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return total money spent by the school
     */
    public int getSchoolMoneySpent() {
        return schoolMoneySpent;
    }

    /**
     * update the money the school spends
     * @param moneySpent is the total money the school spends basically on teacher
     */
    public void updateSchoolMoneySpent(int moneySpent) {
        schoolMoneyEarned -= moneySpent;
    }
}
