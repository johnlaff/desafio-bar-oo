package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        System.out.println("\nRELATÓRIO:");
        System.out.println("Consumo = R$ " + String.format("%.2f", bill.feeding()));
        if (bill.cover() != 0){
            System.out.println("Couvert = R$ " + String.format("%.2f", bill.cover()));
        } else {
            System.out.println("Isento de Couvert");
        }
        System.out.println("Ingresso = R$ " + String.format("%.2f", bill.ticket()));
        System.out.println("\nValor a pagar = R$ " + String.format("%.2f", bill.total()));

        sc.close();
    }
}
