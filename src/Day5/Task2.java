package Day5;

public class Task2 {
    /**
     * Задачи всех дней, где будут использованы классы, выполняйте по следующей
     * структуре:
     * Отдельный класс Автомобиль, Мотоцикл, Человек и т. п.
     * Отдельный класс TaskN в котором статический метод main(). И в этом методе
     * создаете экземпляр нужного класса.
     *
     *
     * 2. Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
     * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
     * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
     * слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
     * консоль.
     */
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2000,"BMW S1000 RR","black");
        System.out.println("Model : "+motorbike.getModel()+"\nYear : "+motorbike.getYear()+"\nColor : "+motorbike.getColor());
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
}