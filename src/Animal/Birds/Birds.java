package Animal.Birds;

import Animal.Animal;

public class Birds extends Animal {
    private boolean hasFeathers = true;
    private boolean canFly = true;

    public boolean isHasFeathers() {
        return this.hasFeathers;
    }

    public void setHasFeathers(boolean hasFeathers) {
        this.hasFeathers = hasFeathers;
    }

    public boolean isCanFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public Birds() {
        super();
    }

    public Birds(double height, double weight, String animal_type, String blood_type) {
        super(height, weight, animal_type, blood_type);
    }
}
