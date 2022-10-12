package Animal.Fish;

import Animal.Animal;

public class Fish extends Animal {
    private String where_to_live = "water";
    private boolean hasGills = true;

    public String getWhere_to_live() {
        return this.where_to_live;
    }

    public void setWhere_to_live(String where_to_live) {
        this.where_to_live = where_to_live;
    }

    public boolean isHasGills() {
        return this.hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

    public Fish() {
        super();
    }

    public Fish(double height, double weight, String animal_type, String blood_type) {
        super(height, weight, animal_type, blood_type);
    }

}
