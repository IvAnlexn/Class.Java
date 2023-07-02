// Класс Крестьянин, наследующий обобщенный класс Character
public class Peasant extends Character {
    public Peasant(String name, int health, int speed) {
        super(name, health, speed);
    }

    @Override
    public void step() {
        System.out.println("Крестьянин " + getName() + " делает шаг.");
    }

    @Override
    public String getInfo() {
        return "Крестьянин";
    }

    @Override
    public void attack() {
        System.out.println("Крестьянин " + getName() + " наносит удар кулаком!");
    }
}