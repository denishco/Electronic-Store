public class Laptop extends Computer {
    private int size;

    public Laptop() {
        super(0, 0, 0, false); // call our base class constructor
        setSize(0);
    }

    public Laptop(double cpu, int ram, int storage, boolean drive, int size) {
        super(cpu, ram, storage, false); // call our base class constructor
        setSize(size);
    }

    public String toString() {
        return(size + "'' Laptop PC with " + cpu + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + driveDescriptor + " drive.");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}