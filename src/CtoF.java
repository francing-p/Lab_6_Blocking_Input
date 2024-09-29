import java.util.Scanner;

public class CtoF {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double temperatureC = 0;
        double temperatureF= 0;
        boolean done = false;
        String trash ="";

        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble()){
                done = true;
                temperatureC= in.nextDouble();
                temperatureF= temperatureC*(1.8) + 32;
                System.out.println(temperatureC + "C = " + temperatureF + "F");
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash +". This is invalid input. Try again. ");

            }
        }
        while(!done);


    }
}
