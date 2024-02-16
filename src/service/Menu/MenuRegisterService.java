package service.Menu;

import service.Menu.inter.MenuRegisterServiceInter;

public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("Register");
    }
}
