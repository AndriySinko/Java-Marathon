package Day7;

import java.util.Random;

public class Task2 {
    /**
     * 2. Дворовый футбол.
     * Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player),
     * содержит следующие поля:
     * - поле “выносливость” (англ. stamina), разное для каждого экземпляра
     * - константы “максимальная выносливость” (англ. MAX_STAMINA) со значением
     * 100 и “минимальная выносливость” (англ. MIN_STAMINA) со значением 0,
     * единые для всех экземпляров
     * - статическое поле countPlayers, которое считает количество игроков на
     * футбольном поле (изначально их 0, выходом на поле считается создание
     * экземпляра класса, уходом - когда игрок устал).
     * - геттер для поля “выносливость”
     *
     * и следующие методы:
     * run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость
     * на 1 при однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и
     * он уходит с поля.
     * info() - выводит сообщение в зависимости от количества игроков на поле. Если
     * игроков меньше 6, то выводит сообщение: “Команды неполные. На поле еще есть ...
     * свободных мест”, иначе: “На поле нет свободных мест”. Грамматикой русского языка
     * пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
     *
     * Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при
     * создании должен иметь значение выносливости от 90 до 100 (генерировать внутри
     * конструктора). Создать 6 игроков, вызвать метод info(). При попытке создать 7,8 …
     * n игрока, количество игроков на поле меняться не должно, проверить это.
     * Примените к игроку метод run(), пока он полностью не выдохнется (отрицательное
     * значение выносливости не допускается). Вывести количество игроков на поле.
     *
     * По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика
     * русского языка учитывалась
     */
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        Player.info();
        System.out.println("Кол-во игроков: "+Player.getCountPlayer());
        System.out.println();

        for(int i=0;i<200;i++){
            player2.run();
            player1.run();
        }
        Player.info();
        System.out.println("Выносливость player1: "+player1.getStamina());
        System.out.println("Выносливость player2: "+player2.getStamina());
        System.out.println("Кол-во игроков: "+Player.getCountPlayer());
        System.out.println();

        Player player7 = new Player();
        Player player8 = new Player();
        Player player9 = new Player();
        Player.info();
        System.out.println("Кол-во игроков: "+Player.getCountPlayer());
    }
}

class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayer;

    public static int getCountPlayer() {
        return countPlayer;
    }

    public Player() {
        Random random = new Random();
        stamina = random.nextInt(90, MAX_STAMINA);
        if (countPlayer < 6) {
            countPlayer++;
        } else {
            countPlayer = 6;
        }

    }

    public void run() {
        if (stamina <= MIN_STAMINA) {
            stamina = MIN_STAMINA;
            return;
        }
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayer--;
        }
    }

    public static void info() {
        if (countPlayer < 6) {
            System.out.println("Команды неполные. На поле есть еще " + (6 - countPlayer) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }
}

