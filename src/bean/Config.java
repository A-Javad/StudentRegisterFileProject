package bean;

import util.FileUtil;

import java.io.Serializable;

public class Config implements Serializable {
    private Student[] students=new Student[0];
    private Teacher[] teachers=new Teacher[0];
    private static Config config=null;
    private static boolean loggedIn;

    private static final String fileName="app.obj";

    public static void initalize() {
        Object obj=FileUtil.readFileDeserialize(fileName);
        if(obj==null){
            return;
        }
        if(obj instanceof Config){
            config=(Config) obj;
        }



    }
    public static void save(){
        FileUtil.writeObjectToFile(Config.instance(),fileName);
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public static Config instance(){
        if (config==null){
            config=new Config();
        }
        return config;

    }
    public void appendStudents(Student s){
        Student[] newStudents=new Student[students.length+1];
        for (int i=0;i<students.length;i++){
            newStudents[i]=students[i];
        }
        newStudents[newStudents.length-1]=s;
        students=newStudents;
    }
    public void appendTeachers(Teacher t){
        Teacher[] newTeachers=new Teacher[teachers.length+1];
        for (int i=0;i<teachers.length;i++){
            newTeachers[i]=teachers[i];
        }
        newTeachers[newTeachers.length-1]=t;
        teachers=newTeachers;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }
}
