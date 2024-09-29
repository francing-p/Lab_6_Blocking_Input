import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height= 0;
        double area = 0;
        double perimeter = 0;
        double theorem = 0;
        double diagonal = 0;
        String trash = "";
        boolean wDouble = false; // check to ensure valid width
        boolean hDouble = false; // check to ensure valid height

        do{
            System.out.print("Enter the rectangle's width: ");
            if (in.hasNextDouble()){
                width = in.nextDouble();
                wDouble = true;
            }
            else{
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input. Try again.");
            }
        }
        while (!wDouble);

        do{
            System.out.print("Enter the rectangle's length: ");
            if (in.hasNextDouble()){
                height = in.nextDouble();
                 hDouble = true;
            }
            else{
                trash=in.nextLine();
                System.out.println(trash + " is not a valid input. Try again. ");
            }
        }
        while (!hDouble);

        area = width*height; // calc area
        perimeter = width*2 + height*2; // calc perimeter
        theorem = (width*width) + (height*height);
        diagonal = Math.sqrt(theorem);
        System.out.println("The perimeter is " + perimeter + ". The area is " + area + ".");
        System.out.println("The diagonal is " + diagonal + ".");

    }
}
