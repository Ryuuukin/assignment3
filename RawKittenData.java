public class RawKittenData {
    private String kittenName;
    private int kittenAge;

    public RawKittenData(String kittenName, int kittenAge) {
        this.kittenName = kittenName;
        this.kittenAge = kittenAge;
    }
    public String getKittenName() {
        return kittenName;
    }
    public void setKittenName(String kittenName) {
        this.kittenName = kittenName;
    }
    public int getKittenAge() {
        return kittenAge;
    }
    public void setKittenAge(int kittenAge) {
        this.kittenAge = kittenAge;
    }
}
