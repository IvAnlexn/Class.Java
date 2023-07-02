// Обобщенный класс, описывающий свойства персонажей
public abstract class BaseHero implements CharacterActions {
    private String name;
    private int health;
    private int speed;

    public BaseHero(String name, int health, int speed) {
        this.name = name;
        this.health = health;
        this.speed = speed;
    }

    // Реализация метода step() из интерфейса
    @Override
    public void step() {
        System.out.println("Персонаж " + name + " делает шаг.");
    }
    @Override
    public void attack() {
        System.out.println("Крестьянин " + name + " наносит удар кулаком!");
    }

    // Геттеры и сеттеры для свойств персонажа
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}