package Day5;

public class Task1 {
    /**
     * Задачи всех дней, где будут использованы классы, выполняйте по следующей
     * структуре:
     * Отдельный класс Автомобиль, Мотоцикл, Человек и т. п.
     * Отдельный класс TaskN в котором статический метод main(). И в этом методе
     * создаете экземпляр нужного класса.
     *
     *
     *
     * 1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
     * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
     * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
     * Созданный вами класс должен отвечать принципам инкапсуляции.
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Blue");
        car.setModel("Audi A6");
        car.setYear(2020);
        System.out.println("Car : "+car.getModel()+"\nYear : "+car.getYear()+"\nColor : "+car.getColor());
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
}