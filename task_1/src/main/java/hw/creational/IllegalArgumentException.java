package hw.creational;

public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException(int age) {
        super("Некорреткное значение возраста. Принимается от 0 до 200. Ваше значение: " + age);
    }

    public IllegalArgumentException(String params) {
        super("Не указаны обязательные данные. Не указано: " + params);
    }
}
