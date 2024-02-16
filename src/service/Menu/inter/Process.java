package service.Menu.inter;

import bean.Config;

public interface Process {
    public default void process(){
        processAbstract();
        Config.save();

    }


    public abstract void processAbstract();
}

