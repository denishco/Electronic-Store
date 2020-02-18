public class Fridge {
    private double size;
    private boolean hasFreezer;
    private String color;
    private String featureDescriptor;

    public Fridge() {
        this(0, false, "");
    }

    public Fridge(double size, boolean hasFreezer, String color) {
        setSize(size);
        setHasFreezer(hasFreezer);
        setColor(color);
    }

    public String toString() {
        return(size + " cubic foot Fridge " + featureDescriptor + " Freezer (" + color + ")");
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean hasFreezer() {
        return hasFreezer;
    }

    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;

        if (this.hasFreezer) {
            featureDescriptor = "with";
        } else {
            featureDescriptor = "without";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}