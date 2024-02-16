package service.Menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.Menu.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void processAbstract() {
        Teacher[] allTeachers= Config.instance().getTeachers();
        for (int i=0;i< allTeachers.length;i++){
            System.out.println(allTeachers[i]);
        }
    }
}
