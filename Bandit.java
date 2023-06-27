// Класс Разбойник, наследующий обобщенный класс Character
public class Bandit extends Character {
    public Bandit(String name, int health, int speed) {
        super(name, health, speed);
    }

    @Override
    public void attack() {
        System.out.println("Разбойник " + getName() + " наносит удар кинжалом!");
    }
}