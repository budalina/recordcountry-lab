package recordcountry;

import java.util.Scanner;

public class Strana {
    // поля класса
    private String name; // название страны
    private String capital; // столица
    private double square; // площадь страны
    private int population; // численность

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

}
