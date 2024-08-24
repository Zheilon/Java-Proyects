package app.company.play;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Ingrese Ancho: ");
        double weight = input.nextDouble();

        System.out.print("Ingrese Largo: ");
        double large = input.nextDouble();

        System.out.printf("Area = %.2f Mts Cuadrados", areaLote(weight, large));
    }

    static double areaLote(double weight, double large)
    { return (weight * large) / 2; }
}