public class Motorcycle extends Vehicles {
    private String engeine;

    public Motorcycle(String engeine, String model, int year, String country, int price, String color, int horses,String ownername) {
        super(model, year, country, price, color, horses,ownername);
        setEngeine(engeine);
    }

    public String getEngeine() {
        return engeine;
    }

    public void setEngeine(String engeine) {
        this.engeine = engeine;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle [getEngeine()=" + getEngeine() + ", getHorses()=" + getHorses() + ", getColor()="
                + getColor() + ", getPrice()=" + getPrice() + ", getModel()=" + getModel() + ", getCountry()="
                + getCountry() + ", getYear()=" + getYear() + "]");
    }

}
