package recordcountry;

import java.util.Scanner;

public class CountryService {
    private static Strana[] country ;

    static {
        country= new Strana[] {
                new Strana("Russia", "Moscow", 17.1, 148),
                new Strana("France", "Paris", 27.1, 137),
                new Strana("Great Britain", "London", 13.1, 150),
                new Strana("Italy", "Rome", 18.1, 104)
        };
    }

    public static void fillCountry(){
        // ВВОД ИНФОРМАЦИИ О СТРАНАХ
        System.out.println("Введите количество стран=> ");
        int n=(new Scanner(System.in,"cp1251")).nextInt();    // количество стран
        country=new Strana[n];
        System.out.println("Введите информацию о странах: ");

        for(int i=0;i<country.length;i++){
            System.out.println("Страна " +(i+1)+"=>");
            country[i]=new Strana();
        }
    }

    public static void printCountry(){
// ВЫВОД ПОЛУЧЕННОЙ ИНФОРМАЦИИ
        System.out.println("\nХарактеристики стран:");
        for(int i=0;i<country.length;i++){
            System.out.println(country[i]);
        }
    }

    public static double avgSquare(){
// СРЕДНЯЯ ПЛОЩАДЬ СТРАН
        double sumSquare=0;
        for(int i=0;i<country.length;i++){
            sumSquare+=country[i].getSquare();
        }
        if(country.length>0)return sumSquare/country.length;
        return-1;
    }

    public static void countriesBiggerThanAvgSquareList(){
// СТРАНЫ С ПЛОЩАДЬЮ БОЛЬШЕ СРЕДНЕЙ
        System.out.println("\nСписок стран с площадью больше средней:");
        for(Strana str:country)
            if(str.getSquare()>avgSquare())System.out.println(str);
    }


}
