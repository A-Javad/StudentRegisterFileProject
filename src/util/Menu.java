package util;

import bean.Config;
import service.Menu.*;
import service.Menu.inter.Process;

public enum Menu {
    LOGIN("Login",new MenuLoginService(),1),
    REGISTER("Register", new MenuRegisterService(),2),
    ADD_TEACHER("Add Teacher",new MenuAddTeacherService(),3),
    ADD_STUDENT("Add Student", new MenuAddStudentService(),4),
    SHOW_ALL_STUDENT("Show all student",new MenuShowStudentService(),5),
    SHOW_ALL_TEACHER("Show all teacher",new MenuShowTeacherService(),6),
    UNKNOWN;

    Menu(){
    }
    private int number;
    private String label;
    private Process service;

    Menu(String label, Process service, int number) {
        this.label = label;
        this.service=service;
        this.number=number;
    }
    public String getLabel(){
        return label;
    }
    @Override
    public String toString() {
        return number+"."+label;
    }
    public void process(){
        service.process();
        MenuUtil.showMenu();

    }
    public int getNumber(){
        return this.number;
    }
    public static Menu find(int number){
        Menu[] menus=Menu.values();
        for (int i=0;i<menus.length;i++){
            if (menus[i].getNumber()==number){
                return menus[i];
            }
        }
        return Menu.UNKNOWN;

    }
    public static void showAllMenu(){
        Menu[] menus=Menu.values();
        for (int i=0;i<menus.length;i++){
            if(menus[i]!=UNKNOWN){
                if (menus[i]==LOGIN || menus[i]==REGISTER){
                    if(!Config.isLoggedIn())
                    System.out.println(menus[i]);
                }else if(Config.isLoggedIn()){
                    System.out.println(menus[i]);
                }

                }
            }

        }
    }

