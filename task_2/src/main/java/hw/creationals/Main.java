package hw.creationals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
            builder.append(list.get(i)).append(" ");
        }
        System.out.println("Вот случайный список: " + builder.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);

        logger.log("Запускаем фильтрацию");

        List<Integer> newList = filter.filterOut(list);

        logger.log("Прошло фильтр " + newList.size() + " элемента из " + list.size());
        logger.log("Выводим результат на экран");
        for (Integer el : newList) {
            builder.append(el).append(" ");
        }
        System.out.println("Отфильтрованный список: " + builder.toString());
        logger.log("Завершаем программу");
    }
}