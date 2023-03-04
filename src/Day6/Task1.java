package Day6;

public class Task1 {
    /**
     * 1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
     * в пакет текущего дня.
     * В классах Автомобиль и Мотоцикл реализовать два метода:
     * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
     * yearDifference() - принимает на вход число (год), и возвращает разницу между
     * переданным годом и годом выпуска транспортного средства
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2016);
        car.info();
        System.out.println(car.yearDifference(2000));

        Motorbike motorbike = new Motorbike(2020,"BMW 1000 Series","Black");
        motorbike.info();
        System.out.println(motorbike.yearDifference(1999));
    }
}
class Car{
    private String color;
    private String model;
    private int year;

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int year){
        return year-this.year;
    }
}
class Motorbike{
    private int year;
    private String model;
    private String color;

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int year){
        return year-this.year;
    }
}