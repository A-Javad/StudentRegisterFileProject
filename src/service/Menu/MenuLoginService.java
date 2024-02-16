package service.Menu;

import bean.Config;
import service.Menu.inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processAbstract() {
        Scanner sc= new Scanner(System.in);
        System.out.println("username:");
        String username= sc.nextLine();

        Scanner sc2= new Scanner(System.in);
        System.out.println("password:");
        String password= sc2.nextLine();

        if(!(username.equals("username")&&password.equals("12345"))){
            throw new IllegalArgumentException("user or password invalid");
        }
        Config.setLoggedIn(true);

    }
}
