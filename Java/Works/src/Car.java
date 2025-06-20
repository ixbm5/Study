public class Car extends Vehicles {
    private String catgory;
    private int seats;


    public Car(String model, int year, String country, int price, String color, int horses,String catgory,int seats,String ownName) {
        super(model, year, country, price, color, horses,ownName);
        setCatgory(catgory);
        setSeats(seats);
    }


    @Override
    void displayInfo() {
        
        System.out.println("Car [Seats" + getSeats() + ", Horses" + getHorses() + ", Catgory" + getCatgory()
                + ", getColor()=" + getColor() + ", getPrice()=" + getPrice() + ", getModel()=" + getModel()
                + ", getCountry()=" + getCountry() + ", getYear()=" + getYear() + "]");
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public String getCatgory() {
        return catgory;
    }

    public void setCatgory(String catgory) {
        if(catgory == null){
            System.out.println("invaild input");
        }else{
        this.catgory = catgory;
    }
    }


    

    

    
    }
    

