import Animal.Reptile.*;
import Animal.Fish.*;
import Animal.Birds.*;

public class App {
    public static void main(String[] args) throws Exception {
        Crocodile crocodile = new Crocodile(3.5, 2000.0, "crocodile", "B");
        Eel eel = new Eel(0.3, 4.0, "Eel", "A");
        Eagle eagle = new Eagle(0.8, 3.0, "Eagle", "T");

        System.out.println("Crocodile's Information");
        System.out.println("-----------------------");
        crocodile.showInfo();
        System.out.println("----------------------\n");

        System.out.println("Eel's Information");
        System.out.println("-----------------------");
        eel.showInfo();
        System.out.println("----------------------\n");

        System.out.println("Eagle's Information");
        System.out.println("-----------------------");
        eagle.showInfo();
        System.out.println("----------------------\n");
    }
}
