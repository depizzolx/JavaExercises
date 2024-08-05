package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrrencyConverter;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //'System.in' diz que os dados serão inseridos através do console

        CurrrencyConverter converter = new CurrrencyConverter();

        System.out.print("Tell me how much dollar you wanna convert: ");
        converter.dBuy = sc.nextDouble();

        System.out.println("The Dollar price is: " + converter.dollar);
        System.out.println("Dollars bought: " + converter.realConverter());
        System.out.println("Amount to be paid in reais: " + converter.finalValor());
    }
}
