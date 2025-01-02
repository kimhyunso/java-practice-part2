package chapter5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        Shape shape;
        if (input == 0)
            shape = new Rectangle();
        else
            shape = new Triangle();
        shape.render();
    }
}
