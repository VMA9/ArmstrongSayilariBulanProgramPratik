import java.util.Scanner;
//Ödev
//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
//
//Örnek : 1643 = 1 + 6 + 4 + 3 = 14
public class ArmstrongSayilariBulanProgramPratik {
    public static void main(String[] args) {
        int number;
        int value;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();


        while (number != 0) {
            value = number % 10;
            total += value;
            number /= 10;
        }
        System.out.println(total);

    }
}