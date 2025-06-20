
import java.util.Scanner;

public class ArrayTest{
    static Scanner in = new Scanner(System.in);
    
     
    
public static void main(String[] args) {
    String[] studnt = new String[5];
    double [] grade = new double[5];
    System.out.println("welcome to myShole");
    boolean con = true;
    while(con!=false){
        System.out.println("for adding a studnt press 1\n for show the student press 2 \n for the average 3");
        int con2 = in.nextInt();
        System.out.println("plese give us the number of the studnt:");
        int many = in.nextInt();
        switch (con2) {
            case 1:
                
                Addstud(studnt, grade,many);
                break;
                
            case 2:

                 showStd(studnt, grade, many);
                 break;

            case 3 :
           
            System.out.println("the average grde of the{\""+many +"\"}student["+average(studnt, grade, many)+"]");
            break;

            case 0:
            System.out.println("thank you good bey!");
            break;
            default:
                throw new AssertionError();
        }

    }
   
    }

    public static void Addstud(String []name, double []grade,int many){
        for (int i = 0; i < many; i++) {
            System.out.println("plese enter the name for studnt number["+(i+1)+"]");
            name[i]= in.next();
            System.out.println("plese enter the grade for studnt number["+(i+1)+"]");
            grade[i] = in.nextDouble();
        }
    }
    public static void showStd (String []name, double []grade,int many){
        for (int i=0;many >i;i++){
            System.out.println("stundnt[\""+name[i]+"\"] got :"+grade[i]);
        }
    }
    public static double average(String []name, double []grade,int many) {
        int avg =0;
        for (int i = 0; i < many; i++) {
         avg += grade[i];
        }
        return avg /many;

    }
  
}
