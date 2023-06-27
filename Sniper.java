// Класс Снайпер, наследующий обобщенный класс Character
public class Sniper extends Character {
    public Sniper(String name, int health, int speed) {
        super(name, health, speed);
    }

    @Override
    public void attack() {
        System.out.println("Снайпер " + getName() + " наносит выстрел из снайперской винтовки!");
    }
}