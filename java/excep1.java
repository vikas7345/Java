import java.util.InputMismatchException;
import java.util.Scanner;

public class excep1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        int height;

       try {
            System.out.println("Enter your name :- ");
            name = sc.next();
            System.out.println("Enter your age :-");
            age = sc.nextInt();
            System.out.println("Enter your height in cm :-");
            height = sc.nextInt();
            int bmi = age / height;
            System.out.println(name + age);
            System.out.println("BMI" + bmi);

        }
       catch (InputMismatchException e){
            System.out.println("Enter only number...");
        }
       catch (ArithmeticException e){
           System.out.println("do not enter zero value...");
       }

    }
}
