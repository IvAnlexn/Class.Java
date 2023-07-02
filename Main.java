// Основной класс программы

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characters1 = new ArrayList<>();
        List<Character> characters2 = new ArrayList<>();

        // Добавление персонажей в списки
        for (int i = 0; i < 10; i++) {
            characters1.add(new Peasant("Иван " + (i + 1), 100, 5));
            characters2.add(new Bandit("Вася " + (i + 1), 80, 7));
        }

        // Вызов метода getInfo() для каждого персонажа
        for (Character character : characters1) {
            System.out.println(character.getInfo());
        }
        // Вызов метода step() для каждого персонажа
        for (Character character : characters1) {
            character.step();
        }
        // Вызов метода attack() для каждого персонажа
        for (Character character : characters1) {
            character.attack();
        }
        for (Character character : characters2) {
            System.out.println(character.getInfo());
        }
    }
}