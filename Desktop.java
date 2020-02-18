public class Desktop extends Computer {
    public Desktop() {
        this(0, 0, 0, false);
    }

    public Desktop(double cpu, int ram, int storage, boolean drive) {
        super(cpu, ram, storage, drive); // call our base class constructor
    }

    public String toString() {
        return("Desktop PC with " + cpu + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + driveDescriptor + " drive.");
    }
}
