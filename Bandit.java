// Класс Разбойник, наследующий обобщенный класс Character
public class Bandit extends Character {
    public Bandit(String name, int health, int speed, int x, int y) {
        super(name, health, speed, x, y);
    }

    @Override
    public void attack() {
        System.out.println("Разбойник " + getName() + " наносит удар кинжалом!");
    }
        @Override
    public void step() {
        System.out.println("Разбойник " + getName() + " делает шаг.");
    }

    @Override
    public String getInfo() {
        return "Разбойник";
    }
}