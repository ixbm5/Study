
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello Welcome To The BMI Calculator \n" + "Please Enter Your Height :");
        double height = in.nextDouble();
        System.out.println("Please Enter Your Weight");
        int Weight = in.nextInt();
        
        double Ibm = Weight / (height * height);
        
        if(Ibm <18.5){
            System.out.printf("your IBM : %.2f - UnderWeight",Ibm);
        }
        else if(24.9>Ibm && Ibm>18.5){
                 System.out.printf("your IBM : %.2f - Normal",Ibm);
        }
        else if(29.9>Ibm && Ibm>25){
            System.out.printf("your IBM : %.2f-OverWeight",Ibm);
        }
        else{
            System.out.printf("your IBM : %.2f-Obese",Ibm);
        }
    in.close();

    }
}
