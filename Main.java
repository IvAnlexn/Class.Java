// Основной класс программы
public class Main {
    public static void main(String[] args) {
        Character peasant = new Peasant("Иван", 100, 5);
        Character bandit = new Bandit("Вася", 80, 7);
        Character sniper = new Sniper("Петр", 120, 10);
        Character warlock = new Warlock("Маг", 90, 6);
        Character spearman = new Spearman("Олег", 110, 8);
        Character crossbowman = new Crossbowman("Артем", 95, 9);
        Character monk = new Monk("Михаил", 85, 4);

        // Вызов действия атаки для каждого персонажа
        peasant.attack();
        bandit.attack();
        sniper.attack();
        warlock.attack();
        spearman.attack();
        crossbowman.attack();
        monk.attack();
    }
}