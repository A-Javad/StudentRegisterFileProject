package service.Menu.inter;

import bean.Config;

public interface SaveableProcess extends Process {
    public default void process(){
        processAbstract();
        Config.save();

    }

}
