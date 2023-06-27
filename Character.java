// Обобщенный класс, описывающий свойства и действия персонажей
public abstract class Character {
    private String name;
    private int health;
    private int speed;

    public Character(String name, int health, int speed) {
        this.name = name;
        this.health = health;
        this.speed = speed;
    }

    public abstract void attack();

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