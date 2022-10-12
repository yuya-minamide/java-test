package Animal.Fish;

public class Eel extends Fish {
    private boolean electric = true;

    public boolean isElectric() {
        return this.electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public Eel() {
        super();
    }

    public Eel(double height, double weight, String animal_type, String blood_type) {
        super(height, weight, animal_type, blood_type);
    }

    public void showInfo() {
        System.out.println("Height(m) is: " + this.getHeight());
        System.out.println("Weight(kg) is: " + this.getWeight());
        System.out.println("Animal type is: " + this.getAnimal_type());
        System.out.println("Blood type is: " + this.getBlood_type());
        System.out.println("Live in: " + this.getWhere_to_live());
        System.out.println("Gills: " + (this.isHasGills() ? "Has gills" : "doesn't have gills"));
        System.out.println("Electric charge: "
                + (this.isElectric() ? "releases electric charge" : "doesn't release electric charge"));
    }

}
