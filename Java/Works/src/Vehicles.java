
abstract public class Vehicles {
    private String ownerName;
    private int price;
    private String model;
    private String country;
    private int year;
    private String color;
    private int horses;

    
   
    public Vehicles(String model,int year,String country,int price,String color,int horses,String ownerName) {
        setModel(model);
        setYear(year);
        setCountry(country); 
        setPrice(price);
        setColor(color);
        setHorses(horses);
        setOwnerName(ownerName);
    }
     public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
     public int getHorses() {
        return horses;
    }
    public void setHorses(int horses) {
        this.horses = horses;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
     public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if(model == null){
            System.out.println("invaill model!");
        }else{
        this.model = model;
    }
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        if(country == null){
            System.out.println("invaill model!");
        }else{
        this.country = country;
    }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if(year <0){
            System.out.println("invaill model!");
        }else{
        this.year = year;
    }
    }
    abstract void displayInfo();
    
}
