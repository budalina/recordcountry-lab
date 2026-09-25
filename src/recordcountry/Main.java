package recordcountry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//создаем экземпляр класса для работы с массивом стран

        cycle: while (true) {
            System.out.println("1. Заполнить массив");
            System.out.println("2. Распечатать");
            System.out.println("3. Найти страны с площадью больше средней");
            System.out.println("4. Найти страну с максимальной площадью");
            System.out.println("5. Упорядочить страны по численности населения");
            System.out.println("6. Упорядочить страны по названиям");
            System.out.println("7. Поиск по названию");
            System.out.println("0. Выход");
            System.out.println("Выберете пункт меню (1..7)");
            int c = (new Scanner(System.in)).nextInt();
            switch (c) {
                case 1: CountryService.fillCountry(); break;
                case 2: CountryService.printCountry(); break;
                case 3: CountryService.countriesBiggerThanAvgSquareList(); break;
                case 4: CountryService.maxSquareCountry(); break;
                case 5: CountryService.sortByPopulation(); break;
                case 6: CountryService.sortByName(); break;
                case 7: CountryService.findByName((new Scanner(System.in)).nextLine()); break;
                default: break cycle;
            }
        }
    }

}
