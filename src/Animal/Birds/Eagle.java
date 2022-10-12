package Animal.Birds;

public class Eagle extends Birds {
    public Eagle() {
        super();
    }

    public Eagle(double height, double weight, String animal_type, String blood_type) {
        super(height, weight, animal_type, blood_type);
    }

    public void showInfo() {
        System.out.println("Height(m) is: " + this.getHeight());
        System.out.println("Weight(kg) is: " + this.getWeight());
        System.out.println("Animal type is: " + this.getAnimal_type());
        System.out.println("Blood type is: " + this.getBlood_type());
        System.out.println("Feathers: " + (this.isHasFeathers() ? "Has feathers" : "doesn't have feathers"));
        System.out.println("Ability of fly: " + (this.isCanFly() ? "Can fly" : "Can't fly"));
    }
}
