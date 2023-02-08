public class RAM {
    private String memory;
    private String country;

    public RAM(String memory, String country) {
        this.memory = memory;
        this.country = country;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}