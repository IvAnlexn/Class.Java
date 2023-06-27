// Класс Колдун, наследующий обобщенный класс Character
public class Warlock extends Character {
    public Warlock(String name, int health, int speed) {
        super(name, health, speed);
    }

    @Override
    public void attack() {
        System.out.println("Колдун " + getName() + " наносит удар магией!");
    }
}