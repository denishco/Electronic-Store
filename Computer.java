// Generic computer class that more concrete implementations of Computer can extend

public abstract class Computer {
    protected double cpu;
    protected int ram;
    protected int storage;
    protected boolean isSsd;
    protected String driveDescriptor;

    Computer() {
        this(0, 0, 0, false);
    }

    Computer(double cpu, int ram, int storage, boolean drive) {
        setCpu(cpu);
        setRam(ram);
        setStorage(storage);
        setIsSsd(drive);
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isSsd() {
        return isSsd;
    }

    public void setIsSsd(boolean isSsd) {
        this.isSsd = isSsd;

        if (isSsd) {
            driveDescriptor = "SSD";
        } else {
            driveDescriptor = "HDD";
        }
    }
}
