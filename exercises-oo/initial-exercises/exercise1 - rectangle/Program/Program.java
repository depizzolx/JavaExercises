package Program;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //'System.in' é o que diz que a váriavel sc da nova instância de "Scanner" receberá dados do console ditados pelo usuário
        Rectangle rectangle = new Rectangle(); //nova instância do objeto Rectangle

        System.out.print("Tell me the Width of your Rectangle, please: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Now, tell me the Height of your Rectangle, please: ");
        rectangle.height = sc.nextDouble();

        System.out.println("The Area of your Rectangle is: " + rectangle.area());
        System.out.println("The Perimeter of your Rectangle is: " + rectangle.perimeter());
        System.out.println("The Diagonal of your Retangle is: " + rectangle.diagonal());
    }
}
