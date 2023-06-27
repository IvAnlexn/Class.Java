// Класс Арбалетчик, наследующий обобщенный класс Character
public class Crossbowman extends Character {
    public Crossbowman(String name, int health, int speed) {
        super(name, health, speed);
    }

    @Override
    public void attack() {
        System.out.println("Арбалетчик " + getName() + " наносит выстрел из арбалета!");
    }
}
