package School.Management.System;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher chibuzor = new Teacher(1,"chibuzor","Ugochukwu",70000);
        Teacher doyin = new Teacher(2,"Adedoyin","Ademokunwa",120000);
        Teacher musa = new Teacher(3,"musa","lawal",100000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(chibuzor);
        teacherList.add(doyin);
        teacherList.add(musa);


        Student dumebi = new Student(1,"dumebi","okoli",3,"90%");
        Student deborah = new Student(2,"deborah","Adenusi",4,"100%");
        Student lawal = new Student(3,"lawal","lawal",3,"40%");
        Student bolaji = new Student(4,"bolaji","odunubi",2,"80%");
        Student esther = new Student(5,"esther","kadiri",2,"100%");

        List<Student> studentList = new ArrayList<>();
        studentList.add(dumebi);
        studentList.add(deborah);
        studentList.add(lawal);
        studentList.add(bolaji);
        studentList.add(esther);


        School badoreModelCollege = new School(teacherList,studentList);
        esther.updatePaidFees(5000);
        lawal.updatePaidFees(3000);
        System.out.println("The school has earned: $"+ badoreModelCollege.getSchoolMoneyEarned());


    }
}
