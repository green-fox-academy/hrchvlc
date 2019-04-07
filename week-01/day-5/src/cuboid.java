import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme width of your cuboid");
        int width = scanner.nextInt();
        System.out.println("Gimme length of your cuboid");
        int length = scanner.nextInt();
        System.out.println("Gimme height of your cuboid");
        int height = scanner.nextInt();

        System.out.println("Surface area: " + (2 * width * length + 2 * length * height + 2 * height * width));
        System.out.println("Volume: " + (width * length * height));
    }
}

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// Surface Area: 600
// Volume: 1000