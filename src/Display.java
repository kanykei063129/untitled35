public class Display {
    private double diog;
    private String Country;
    private String typeMatric;

    public Display(double diog, String country, String typeMatric) {
        this.diog = diog;
        Country = country;
        this.typeMatric = typeMatric;
    }

    public double getDiog() {
        return diog;
    }

    public void setDiog(double diog) {
        this.diog = diog;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getTypeMatric() {
        return typeMatric;
    }

    public void setTypeMatric(String typeMatric) {
        this.typeMatric = typeMatric;
    }
}
