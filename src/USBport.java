public class USBport {
    private double typePort;
    private long ID;

    public USBport(double typePort, long ID) {
        this.typePort = typePort;
        this.ID = ID;
    }

    public double getTypePort() {
        return typePort;
    }

    public void setTypePort(double typePort) {
        this.typePort = typePort;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
