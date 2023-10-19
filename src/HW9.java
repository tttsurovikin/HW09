import java.util.Random;
import java.util.Scanner;

public class HW9 {
    public static <b> void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int number = scanner.nextInt();

        System.out.println("Ваше число = " + number);

        Random random = new Random();

        int r = random.nextInt(10);
        System.out.println("Загадане число = " + r);



        if (number == r) {
            System.out.println("Вітаю вас, ви виграли! ");
        }
        else {
            System.out.println("Ваша відповідь не співпала з загаданим числом, ви програли. ");
            System.out.println("У вас залишилось 2 спроби. ");
        }
// ДРУГА СПРОБА
        System.out.println("Введіть число: ");
        int number2 = scanner.nextInt();

        System.out.println("Ваше число = " + number2);

        Random random2 = new Random();

        int r2 = random.nextInt(10);
        System.out.println("Загадане число = " + r2);



        if (number2 == r2) {
            System.out.println("Вітаю вас, ви виграли! ");
        }
        else {
            System.out.println("Ваша відповідь не співпала з загаданим числом, ви програли. ");
            System.out.println("У вас залишилось 1 спробa. ");
        }
        //ТРЕТЯ СПРОБА
        System.out.println("Введіть число: ");
        int number3 = scanner.nextInt();

        System.out.println("Ваше число = " + number3);

        Random random3 = new Random();

        int r3 = random.nextInt(10);
        System.out.println("Загадане число = " + r3);



        if (number3 == r3) {
            System.out.println("Вітаю вас, ви виграли! ");
        }
        else {
            System.out.println("Ваша відповідь не співпала з загаданим числом, ви програли. ");
            System.out.println("В вас не залишилось більше спроб. Дякуемо за гру!");

        }
    }
}