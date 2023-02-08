public class HDD {
    private String memorySSD;
    private int disk;

    public HDD(String memorySSD, int disk) {
        this.memorySSD = memorySSD;
        this.disk = disk;
    }

    public String getMemorySSD() {
        return memorySSD;
    }

    public void setMemorySSD(String memorySSD) {
        this.memorySSD = memorySSD;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
