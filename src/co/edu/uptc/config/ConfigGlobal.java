package co.edu.uptc.config;

import co.edu.uptc.test.ManagerProperties;

public class ConfigGlobal {
    

    public void loadProperties(){
        ManagerProperties serviceProperties= new ManagerProperties();
        serviceProperties.setFileName("configuration.properties");
        
    }
}
