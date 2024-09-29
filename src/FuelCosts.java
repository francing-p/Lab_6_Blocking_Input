import java.util.Scanner; // import scanner

public class FuelCosts {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in); // create scanner instance


        // define variables and booleans for each while loop
        double gallons = 0; boolean galDouble = false;
        double efficiency = 0; boolean efiDouble =false;
        double priceGallon = 0; boolean priceDouble =false;
        String trash = ""; // use for bad input
        // cannot use same boolean because it will have already been rendered as true in the first loop

        double costHundred = 0; // cost to go 100 miles
        double fullTank = 0; // miles able to travel on a full tank

        do {
            System.out.print("Input # of gallons of gas in tank: ");
            if (in.hasNextDouble()){ // if input is a double
                gallons = in.nextDouble(); // assign variable
                galDouble=true; // end loop
            }
            else{
               trash = in.nextLine();
                System.out.println(trash + " is not a valid input. try again.");
                // show bad input, try again
            }
        }
        while (!galDouble); // continues while gallon is not a double, continue asking

        do{
            System.out.print("Input fuel efficiency (miles/gallon): ");
            if (in.hasNextDouble()){ // if input is a double
                efficiency=in.nextDouble(); // assign variable
                efiDouble=true; // end loop
            }
            else{
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input. Try again. ");
            }
        }
        while (!efiDouble); // continues while fuel efficiency is not a double, continue asking

        do{
            System.out.print("What is the price of gas per gallon? $");
            if (in.hasNextDouble()){ // if input is a double
                priceGallon=in.nextDouble(); // assign variable
                priceDouble=true; // end loop
            }
            else{
                trash=in.nextLine();
                System.out.println(trash + " is not a valid input. Try again. ");
            }

        }
        while (!priceDouble); // continues while price per gallon is not a double, continue asking

        fullTank = gallons*efficiency; // calculate distance to go on a full tank
        costHundred = (100/efficiency)*priceGallon; // calculate cost for 100 miles
        // ex.) if I can go 10 miles/gallon, I need 10 gallons of gas (100/10), multiply by cost per gallon

        System.out.println("You can drive " + fullTank + " miles on a full tank.");
        System.out.println("It will cost $" + costHundred + " to drive 100 miles.");
    }
}
