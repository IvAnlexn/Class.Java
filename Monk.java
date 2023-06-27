// Класс Монах, наследующий обобщенный класс Character
public class Monk extends Character {
    public Monk(String name, int health, int speed) {
        super(name, health, speed);
    }

    @Override
    public void attack() {
        System.out.println("Монах " + getName() + " наносит удар кулаком!");
    }
}