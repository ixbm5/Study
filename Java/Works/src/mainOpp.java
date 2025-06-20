
import java.util.Scanner;

public class mainOpp {
    public static void main(String[] args) {
        Crage crage = new Crage() ;
    Scanner input = new Scanner(System.in) ;
    int choice_menu;
    int choice;

    do{
    System.out.println("menu");
    System.out.println("for adding vehicle 1");
    System.out.println("for remove vehicle 2");
    System.out.println("for showing how many car in the crage 4");
    System.out.println("stop 0");
    choice_menu = input.nextInt();
    if (choice_menu == 0){
        break;
    }
    else{
        switch (choice_menu) {
            case 1 :
             System.out.println("add car 1");
             System.out.println("adding truck 2");
             System.out.println("adding mottocycle 3");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                    System.out.println("plese enter the owner name:");
                    String ownName = input.next();
                    System.out.println("plese enter the modle");
                    String model = input.next();
                    System.out.println("plese enter the year of predction:");
                    int year = input.nextInt();
                    System.out.println("plese enter the color of the car:");
                    String color = input.next();
                    System.out.println("plese enter the horeses power:");
                    int horses = input.nextInt();
                    System.out.println("plese enter the owner countery of the car:");
                    String contery = input.next();
                    System.out.println("plese enter the seats number");
                    int seat = input.nextInt();
                    System.out.println("plese enter the price of the car:");
                    int price = input.nextInt();
                    crage.addVehile(new Car(model, year, contery, price, color, horses, contery, seat, ownName));
                        
                        break;
                    case 2:
                    System.out.println("plese enter the owner name:");
                    String ownNameT = input.next();
                    System.out.println("plese enter the modle");
                    String modelT = input.next();
                    System.out.println("plese enter the year of predction:");
                    int yearT = input.nextInt();
                    System.out.println("plese enter the color of the truck:");
                    String colorT = input.next();
                    System.out.println("plese enter the horeses power:");
                    int horsesT = input.nextInt();
                    System.out.println("plese enter the owner countery of the truck:");
                    String conteryT = input.next();
                    System.out.println("plese enter the price of the truck:");
                    int priceT = input.nextInt();
                    System.out.println("plese the cargo max of the truck");
                    int cargo = input.nextInt();
                    crage.addVehile(new Truck(cargo, modelT, yearT, conteryT, priceT, colorT, horsesT, ownNameT));
                    break;

                    case 3:
                    System.out.println("plese enter the owner name:");
                    String ownNamem = input.next();
                    System.out.println("plese enter the modle");
                    String modelm = input.next();
                    System.out.println("plese enter the year of predction:");
                    int yearm = input.nextInt();
                    System.out.println("plese enter the color of the truck:");
                    String colorm = input.next();
                    System.out.println("plese enter the horeses power:");
                    int horsesm = input.nextInt();
                    System.out.println("plese enter the owner countery of the truck:");
                    String conterym = input.next();
                    System.out.println("plese enter the price of the truck:");
                    int pricem = input.nextInt();
                    System.out.println("plese the cargo max of the truck");
                    String engang = input.next();
                    crage.addVehile(new Motorcycle(engang, modelm, yearm, conterym, pricem, colorm, horsesm, ownNamem));
                    break;

                    default:
                        throw new AssertionError("invaild input!");
                }
                break;
            case 2:
            System.out.println("delete by model 1");
            System.out.println("delete by owner name 2");
            choice = input.nextInt();
             switch (choice) {
                 case 1 :
                 System.out.println("plese enter the model");
                 String model = input.next();
                 crage.removeVehicleByModle(model);
                     
                     break;
                     case 2:
                     System.out.println("plese enter the owner name ");
                     String ownrName = input.next();
                     crage.removebyOwnName(ownrName);
                 default:
                     throw new AssertionError();
             }
             break;
            case 4:
            System.out.println("total number of vehicles is "+crage.numberOfVehice());
                
                break;

            default:
                throw new AssertionError();
        }
    }
    }while (true);
        
    
}
}
