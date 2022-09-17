import java.util.Scanner;

public class Hailstone {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a positive integer: ");
        int num = keyboard.nextInt();
        hailstones(num);
    }
    public static void hailstones(int num) {
        System.out.print("The hailstone sequence is: ");
        System.out.print(num+",");
        if (num % 2 == 0) {
            num=num/2;
        }
        else {
            num=num*3+1;
        }
        while (num>1){

            System.out.print(num+",");
            if (num % 2 == 0) {
                num=num/2;
            }
            else {
                num=num*3+1;
            }
        }
        System.out.print(num+"...");
    }

}
