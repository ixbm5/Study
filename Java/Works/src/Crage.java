
import java.util.ArrayList;

public class Crage {
    ArrayList<Vehicles> vehicl = new ArrayList<>();
    void addVehile(Vehicles v){
        vehicl.add(v);
    }
    void removeVehicleByModle(String modle){
     vehicl.removeIf(vehicl-> vehicl.getModel().equalsIgnoreCase(modle));
    }
    void removebyOwnName(String ownNamw){
        vehicl.removeIf(vehicl-> vehicl.getOwnerName().equalsIgnoreCase(ownNamw));
    }
    int numberOfVehice(){
        return vehicl.size();
    }
}
