// Обобщенный класс, описывающий свойства и действия персонажей
public abstract class Character {
    public String name;
    private int health;
    private int speed;
    private Coordinates coordinates;
    public Character(String name, int health, int speed, int x, int y) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        coordinates = new Coordinates(x, y);
    }
        public Coordinates getCoordinates() {
        return coordinates;
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

    public String getInfo() {
        return null;
    }

    public void step() {
        System.out.println("Персонаж " + name + " делает шаг.");
    }
}