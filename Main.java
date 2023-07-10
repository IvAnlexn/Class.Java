// Основной класс программы

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bandit bandit = new Bandit("Иван", 100, 5, 0, 5);
        Peasant peasant = new Peasant("Таргет", 50, 3, 20, 15);

        // Вычисление расстояния между разбойником и фермером
        double distance = calculateDistance(bandit.getCoordinates(), peasant.getCoordinates());
        System.out.println("Расстояние до противника: " + distance);

        String targetName = peasant.getName(); // Получение имени противника
        System.out.println("Имя противника: " + targetName);
    }

    // Метод для вычисления расстояния между двумя координатами
    public static double calculateDistance(Coordinates c1, Coordinates c2) {
        int xDiff = c2.getX() - c1.getX();
        int yDiff = c2.getY() - c1.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}