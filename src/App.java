import co.edu.uptc.config.ConfigGlobal;
import co.edu.uptc.services.PeopleGenerator;

public class App {
    public static void main(String[] args) { 
        ConfigGlobal configGlobal= new ConfigGlobal();
        configGlobal.loadProperties();

        PeopleGenerator peopleGenerator= new PeopleGenerator();
        // peopleGenerator.loadNames();
        // peopleGenerator.showNames();
    }
}
