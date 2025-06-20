public class Truck extends Vehicles {
    private int Cargo;
    public Truck(int Cargo, String model, int year, String country, int price, String color, int horses,String ownerName) {
        super(model, year, country, price, color, horses,ownerName);
        setCargo(Cargo);
    }
    public int getCargo() {
        return Cargo;
    }

    public void setCargo(int cargo) {
        if(cargo<0){
            System.out.println("invilde input");
        }else{
        Cargo = cargo;
        }
    }

   

    @Override
    void displayInfo() {
        System.out.println("Truck [getCargo()=" + getCargo() + ", getHorses()=" + getHorses() + ", getColor()=" + getColor()
                + ", getPrice()=" + getPrice() + ", getModel()=" + getModel() + ", getCountry()=" + getCountry()
                + ", getYear()=" + getYear() + "]");
    }
    

    
}
