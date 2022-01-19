package helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void sayHello(){

        // The original task was to get the program to print hello world
        /*String s = "Hello World!";
        System.out.println(s);*/
        // However, we got it to run a sick function.
        String s = "Input the radius of any circle to get the circumference: ";
        System.out.print(s);

        Scanner scanner = new Scanner( System.in);
        String input = scanner.nextLine();
        double cirRadius = Integer.parseInt(input);
        double circumference = 2*3.14*cirRadius;

        System.out.print("Circumference is: " );
        System.out.print(circumference);
    }
    public static void main(String[] args) {
	new HelloWorld().sayHello();

    }
}
