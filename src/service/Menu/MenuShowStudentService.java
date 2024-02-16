package service.Menu;

import bean.Config;
import bean.Student;
import service.Menu.inter.MenuShowStudentsServiceInter;

public class MenuShowStudentService implements MenuShowStudentsServiceInter {
    @Override
    public void processAbstract() {
        Student[] allStudent= Config.instance().getStudents();
        for (int i=0;i< allStudent.length;i++){
            System.out.println(allStudent[i]);
        }
    }
}
