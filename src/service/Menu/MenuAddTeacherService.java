package service.Menu;

import bean.Config;
import bean.Teacher;
import service.Menu.inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void processAbstract() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name= sc.nextLine();


        System.out.println("Enter surname:");
        Scanner sc2=new Scanner(System.in);
        String surname= sc2.nextLine();

        Teacher t=new Teacher();
        t.setName(name);
        t.setSurname(surname);


        Config.instance().appendTeachers(t);
        System.out.println("Teacher added.");


    }
}
