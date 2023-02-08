public class Computer {
    private Display display;
    private String name;
    private String colour;
    private HDD hdd;
    private String videoCard;
    private USBport usBport;
    private Keyboard keyboard;

    public Computer(Display display, String name, String colour, HDD hdd, String videoCard, USBport usBport, Keyboard keyboard) {
        this.display = display;
        this.name = name;
        this.colour = colour;
        this.hdd = hdd;
        this.videoCard = videoCard;
        this.usBport = usBport;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public USBport getUsBport() {
        return usBport;
    }

    public void setUsBport(USBport usBport) {
        this.usBport = usBport;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
