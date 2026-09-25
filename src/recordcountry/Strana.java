package recordcountry;

import java.util.Scanner;

public class Strana {
    // поля класса
    private String name; // название страны
    private String capital; // столица
    private double square; // площадь страны
    private int population; // численность
    private static Strana[] country ;

    static {
        country= new Strana[] {
                new Strana("Russia", "Moscow", 17.1, 148),
                new Strana("France", "Paris", 27.1, 137),
                new Strana("Great Britain", "London", 13.1, 150),
                new Strana("Italy", "Rome", 18.1, 104)
        };
    }
    // конструкторы
    public Strana(String name, String capital, double square, int population) {
        this.name = name;
        this.capital = capital;
        this.square = square;
        this.population = population;
    }

    public Strana() {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Название : ");
        this.setName(sc.nextLine());
        System.out.print("\tСтолица : ");
        this.setCapital(sc.nextLine());
        System.out.print("\tПлощадь : ");
        this.setSquare(sc.nextDouble());
        System.out.print("\tЧисленность : ");
        this.setPopulation(sc.nextInt());

    }

    // метод toString
    public String toString() {
        return String.format(" Страна: %s ==>   столица: %s \t площадь = %5.2f млн кв.км \t численность =%d тыс.чел. ",
                name, capital, square, population);
    }

    //геттеры и сеттеры для всех полей
    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        /*в сеттерах обязательно сделать проверку на допустимость записываемого значения! */
        if (value.isEmpty())
            System.out.println("Недопустимое значение !");
        else this.name = value;
    }
    //для остальных полей аналогично

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        if (capital.isEmpty()) System.out.println("Недопустимое значение !");
        else
            this.capital = capital;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        if (square<=0) System.out.println("Недопустимое значение !");
        else
            this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<=0) System.out.println("Недопустимое значение !");
        else
            this.population = population;
    }









    public static void sortByPopulation(){
// СОРТИРОВКА СТРАН ПО ЧИСЛЕННОСТИ
        for(int i=0;i<country.length-1;i++)
            for(int j=0;j<country.length-1-i;j++)
                if(country[j].getPopulation()>country[j+1].getPopulation()){
                    Strana rab=country[j];
                    country[j]=country[j+1];
                    country[j+1]=rab;
                }
        System.out.println("\nОтсортированный список по численности:");//
        for(int i=0;i<country.length;i++){
            System.out.println(""+country[i]);}
    }

    public static void sortByName(){
// СОРТИРОВКА СТРАН ПО НАЗВАНИЮ
        for(int i=0;i<country.length-1;i++)
            for(int j=0;j<country.length-i-1;j++)
                if(country[j].getName().compareTo(country[i+1].getName())>0){
                    Strana rab=country[j];
                    country[j]=country[j+1];
                    country[j+1]=rab;
                }
        System.out.println("\nОтсортированный список по названиям:");
        for(int i=0;i<country.length;i++){
            System.out.println(""+country[i]);
        }
    }

}
