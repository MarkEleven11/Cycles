public class Main {

    public static void main(String[] args) {

        ///Задание1

        ///Task1
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
           System.out.println(i);
        }

        ///Task2
        System.out.println("Task 2");
        for (int a = 10; a >=1 ; a--) {
            System.out.println(a);
        }

        ///Task3
        System.out.println("Task 3");
        for (int b = 0 + 2; b <= 17; b = b + 2) {
            System.out.println(b);
        }

        ///Task4
        System.out.println("Task 4");
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }

        ///Задание 2

        ///Task1
        System.out.println("Task 1");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year);
        }

        ///Task2
        System.out.println("Task 2");
        for (int number = 7; number <= 98; number = number + 7) {
            System.out.println(number);
        }

        ///Task3
        System.out.println("Task 3");
        for (int chislo = 1; chislo <= 512; chislo = chislo * 2) {
            System.out.println(chislo);
        }

        ///Задание 3

        ///Task1
        System.out.println("Task 1");
        int money = 29000;
        int full = 0;
        for (int y = 1; y <= 12; y++) {
            full += money;
            System.out.println("Месяц " + y + ", сумма накоплений равна " + full + " рублей.");
        }

        ///Task2
        System.out.println("Task 2");
        int money1 = 29000;
        int full1 = 0;
        for (int d = 1; d <= 12; d++){
            full1 = full1 + money1 / 100;
            full1 += money1;
            System.out.println("Месяц " + d + ", сумма накоплений равна " + full1 + " рублей.");
        }





    }
}