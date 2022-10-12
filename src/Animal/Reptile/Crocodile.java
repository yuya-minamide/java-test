package Animal.Reptile;

public class Crocodile extends Reptile {
    public Crocodile() {
        super();
        this.setEggshell_type("hard");
    }

    public Crocodile(double height, double weight, String animal_type, String blood_type) {
        super(height, weight, animal_type, blood_type);
        this.setEggshell_type("hard");
    }

    public void showInfo() {
        System.out.println("Height(m) is: " + this.getHeight());
        System.out.println("Weight(kg) is: " + this.getWeight());
        System.out.println("Animal type is: " + this.getAnimal_type());
        System.out.println("Blood type is: " + this.getBlood_type());
        System.out.println("Skin type is: " + this.getSkin_type());
        System.out.println("Backbone: " + (this.isHasBackbone() ? "Has backbone" : "doesn't have backbone"));
        System.out.println("Eggshell type is: " + (this.getEggshell_type()));
    }
}
