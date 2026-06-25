import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//
//        System.out.println("hello " + name);
//        System.out.println("you are " + age + " years old");

//        common issues

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // to avoid sc taking /n as input

        System.out.print("what is your favorite color? ");
        String color = sc.nextLine();

        System.out.println("your are " + age + " years old");
        System.out.println("your favorite color is " + color);


        sc.close();
    }
}
