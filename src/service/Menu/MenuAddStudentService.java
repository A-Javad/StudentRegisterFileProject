package service.Menu;

import bean.Config;
import bean.Student;
import service.Menu.inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processAbstract() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name= sc.nextLine();



        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter surname:");
        String surname= sc2.nextLine();

        Student s=new Student();
        s.setName(name);
        s.setSurname(surname);


        Config.instance().appendStudents(s);
        System.out.println("Student added.");






    }
}
