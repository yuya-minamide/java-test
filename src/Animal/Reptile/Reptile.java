package Animal.Reptile;

import Animal.Animal;

public class Reptile extends Animal {
    private String skin_type = "dry";
    private boolean hasBackbone = true;
    private String eggshell_type = "soft";

    public String getSkin_type() {
        return this.skin_type;
    }

    public void setSkin_type(String skin_type) {
        this.skin_type = skin_type;
    }

    public boolean isHasBackbone() {
        return this.hasBackbone;
    }

    public void setHasBackbone(boolean hasBackbone) {
        this.hasBackbone = hasBackbone;
    }

    public String getEggshell_type() {
        return this.eggshell_type;
    }

    public void setEggshell_type(String eggshell_type) {
        this.eggshell_type = eggshell_type;
    }

    public Reptile() {
        super();
    }

    public Reptile(double height, double weight, String animal_type, String blood_type) {
        super(height, weight, animal_type, blood_type);
    }
}
