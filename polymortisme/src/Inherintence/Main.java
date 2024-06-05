package Inherintence;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi 1: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi 2: ");
        double side2 = input.nextDouble();

        System.out.print("Masukkan sisi 3: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String color = input.next();

        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean filled = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setWarna(color);
        segitiga.setProperti(filled);

        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.properti());
    }
}
